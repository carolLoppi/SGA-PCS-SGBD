package br.unirio.sga.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unirio.sga.service.LoginService;

/*
 * Servlet responsável por tratar requisições de login.
 */
public class ServletSGA extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		String nomeOperador = LoginService.autenticaOperador(login, senha);
		//validar se nome not null e redirect
		request.setAttribute (nomeOperador, nomeOperador);
		// request.setAttribute (Constants.INDEX_KEY, -1);
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/SGA/sucesso.jsp");
		rd.forward(request, response);
	}
	
	
}
