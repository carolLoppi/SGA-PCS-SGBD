package br.unirio.sga.service;

import java.sql.SQLException;

import br.unirio.sga.dao.OperadorSistemaDAO;

public class LoginService {

	public static String autenticaOperador(String login, String senha){
		
		try {
		
			String nome =  OperadorSistemaDAO.autenticaOperador(login, senha);
			if(nome == null){				
				return null;
			}
			return nome;

		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		
		}

	}
	


}
