package br.unirio.sga.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* 
 * Verificar possibilidade de remoção
 */
public class JDBCConnection {

	public static void main(String[] argv) {

		try{

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SGAData", "postgres","admin");
			if(con!=null)
				System.out.println("Connected");
			
			//Statement st = con.createStatement();
			//st.execute("INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (2, 'Rua da Moema', 423, 2201, '22051070', 'Moema', 'SP');");
		
			
			Statement sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet clientes = sql.executeQuery("select * from endereco"); 
			while(clientes.next())
				System.out.println(clientes.getString("estado"));
			
			clientes.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();

		}
	}

}
