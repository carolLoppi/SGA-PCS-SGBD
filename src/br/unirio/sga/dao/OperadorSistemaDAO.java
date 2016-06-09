package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.unirio.sga.persistence.JDBCConnection;

public class OperadorSistemaDAO {

	/*Métodos a implementar(e suas respectivas queries - em SQL puro:
	 * getById()
	 * getByEmail() 
	 */
	
	public static String autenticaOperador(String login, String senha) throws SQLException{
		
		String query = "SELECT * FROM operador_do_sistema WHERE login = '" + login + "' AND senha = '" + senha + "' ;";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet usuarios = sql.executeQuery(query); 
		String temp = null;
		while(usuarios.next()){
		
			temp = usuarios.getString("nome");
		
		}
		conexao.close();
		return temp;
		
	}
}
	
	
	
	
		
	
	

