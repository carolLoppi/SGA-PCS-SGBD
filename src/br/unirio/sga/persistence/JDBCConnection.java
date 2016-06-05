package br.unirio.sga.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] argv) {

		try{

			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SGAData", "postgres","admin");
			if(con!=null)
				System.out.println("Connected");
			
			Statement st = con.createStatement();
			st.execute("INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (2, 'Rua da Moema', 423, 2201, '22051070', 'Moema', 'SP');");
			
			
		
		} catch (Exception e) {
			
			e.printStackTrace();

		}
	}

}
