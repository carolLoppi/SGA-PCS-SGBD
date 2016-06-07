package br.unirio.sga.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* 
 * Posteriormente criar executaQuery com retorno de apenas um elemento se for necessário
 */
public class JDBCConnection {

	public static ResultSet executaQuery(String query) {

		try{
		
			Class.forName("org.postgresql.Driver");		
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SGAData", "postgres","admin");
			
			Statement sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = sql.executeQuery(query); 
			return resultSet;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;

		}
	}

}
