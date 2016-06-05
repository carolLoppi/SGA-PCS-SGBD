package br.unirio.sga.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 
 * Servlet responsável por atuar no processamento de entrada de material.
 */
public class ServletEntrada extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CompactDisc cd = new CompactDisc ();
		// request.setAttribute (Constants.CD_KEY, cd);
		// request.setAttribute (Constants.INDEX_KEY, -1);
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/entrada.jsp");
		rd.forward(request, response);
	}
	
}
