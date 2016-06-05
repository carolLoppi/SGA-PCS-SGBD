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
 * Servlet responsável por tratar requisições na página principal/home/wildcard
 */
public class ServletHome extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
	}
	

	
	
	
}
