package br.unirio.sga.service;

import br.unirio.sga.dao.OperadorSistemaDAO;

public class LoginService {

	public static String autenticaOperador(String login, String senha){
		
		return OperadorSistemaDAO.autenticaOperador(login, senha);

		
	}
	


}
