package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtil {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/curso"; 
	private static final String USUARIO = "postgres";
	private static final String SENHA = "admin";
	private static final String DRIVER = "org.postgresql.Driver";
	private static Connection conexao;
			
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Não foi possivel carregar o Driver do Banco");
		}
	}
	
	public static Connection getConexao(){
		
		try{
			if(conexao == null || conexao.isClosed()){
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			}
		}catch(SQLException ex){
			System.out.println("Falha na conexão com o Banco de Dados");
			ex.printStackTrace();
		}
		
		return conexao;
	}
	public static void main(String[] args) throws SQLException {
		Connection con = getConexao();
		if(con != null){
			System.out.println("Conexão realizada com sucesso");
			con.close();
		}else{
			System.out.println("Ops, Turma temos um problema!");
		}
	}
}
