package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import br.unirio.sga.model.Alocacao;
import br.unirio.sga.model.Material;
import br.unirio.sga.model.OperadorSistema;

public class OperadorSistemaDAO {

	/*Métodos a implementar(e suas respectivas queries - em SQL puro:
	 * getById()
	 * getByEmail() 
	 */
	
public static String autenticaOperador(String login, String senha){
		
		try{
			
			Connection connection = ConnectionFactory.get();
			Statement sql = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet usuario = sql.executeQuery("SELECT * FROM operador_do_sistema WHERE login = " + login + "AND senha = " + senha + ";"); 
			String nome = (usuario.getString("nome"));
			
			if(usuario == null)
				return null;

			sql.close();
			return nome;
		
		}
		catch (Exception e){
			
			return null;
		}
		
	}
	
}
