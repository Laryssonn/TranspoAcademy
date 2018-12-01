package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Reposistio de contatos, responsavel por realizar a transformação dos dados entre paradigma do banco de dados e a aplicação (o>O)
 * @author Larysson
 *
 */


public class RepositorioContato {
	
	public void inserir(Contato contato){
		String sql = "insert into contatos(nome, email,telefone) values(?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando  = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			
			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			if(keys.next()){
				Integer id = keys.getInt(1);
				contato.setId(id);
			}
			keys.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel inserir o registro no banco");
		}
	}
	
	public List<Contato> buscarTodos(){
		List<Contato> lista = new ArrayList<>();
		String sql = " select * from contatos";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Contato contato = null;
			while(cursor.next()){
				contato = criarContato(cursor);
				lista.add(contato);
			}
			
			
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar os contatos");
		}
		
		return lista;
	}
	
	
	
	
	public Contato criarContato(ResultSet cursor) throws SQLException{
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id,nome,email,telefone);		
	}
	
	
	public Contato buscarId(Integer id){
		Contato contato = null;
		String sql = " select * from contatos where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				contato = criarContato(cursor);
			
			}
			
			
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar o contato");
		}
		
		return contato;
	}
	
	public void atualizar(Contato contato){
		String sql = "update contatos set nome = ?, email = ?,telefone = ? where id = ?";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando  = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			comando.setInt(4, contato.getId());
			
			comando.executeUpdate();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi atualizar o registro no banco");
		}
	}
	
	public void remover(Integer id){
		String sql = " delete from contatos where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();
			
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possivel remover o contato");
		}
	}
	
	public long contar(){
		String sql = " select count (*) as total  from contatos";
		Connection conexao = BancoUtil.getConexao();
		long total = 0;
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			
			if(cursor.next()){
				total = cursor.getLong("total");
			}
			
			cursor.close();
			comando.close();
			
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possivel remover o contato");
		}
		
		return total;
	}
}
