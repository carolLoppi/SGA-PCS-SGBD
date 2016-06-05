package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/* Classe responsável por realizar e centralizar a conexão com o banco
 * 
 */
public class ConnectionFactory {
	public static Connection get() {
			try{
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SGAData", "postgres","admin");
				if(con!=null)
					System.out.println("Connected");
				return con;
			}
			catch(Exception e){
				
				e.printStackTrace();
				return null;
			}
			

	} 
}
