package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDao {

	public void inserir(Produto produto){
		Connection con = BancoUtil.getConexao();
		String sql = "insert into produtos(nome, descricao, preco) values (?, ?, ?)";
		try {
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			
			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			
			if(keys.next()){
				Integer id = keys.getInt(1);
				produto.setId(id);
			}
			keys.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possuivel inserir dados no banco");
		}
	}
	
	public void deletar(int id){
		String sql = "delete from produtos where id = ?";
		Connection con = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setInt(1, id);
			comando.execute();
			comando.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void atualizar(Produto produto){
		String sql = "update produto set nome = ?, descricao = ?, preco = ? where id = ?";
		Connection con = BancoUtil.getConexao();
		
		try {
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			comando.setInt(4, produto.getId());
			
			comando.executeUpdate();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possivel atualizar o produto");
		}
	}
	public Produto buscarProduto(int id){
		Produto produto = null;
		String sql = "select * from produtos where id= ?";
		Connection con = BancoUtil.getConexao();
		
		try {
			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				produto = criarProduto(cursor);
			}
			
		} catch (SQLException e) {
			System.out.println("Não foi possivel buscar o Produto");
		}
		
		return produto;
	}

	private Produto criarProduto(ResultSet cursor) throws SQLException  {
		int id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String descricao = cursor.getString("descricao");
		double preco = cursor.getDouble("preco");
		
		return new Produto(id,nome,descricao,preco);
	}
}
