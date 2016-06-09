package br.unirio.sga.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletRedirecionaSecao")
public class ServletRedirecionaSecao extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public ServletRedirecionaSecao() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	String opcaoEntrada = request.getParameter("entrada");
    	String opcaoSaida = request.getParameter("saida");
    	String loginOperador = request.getParameter("login");

    	ServletContext context = getServletContext();

		if(opcaoEntrada != null){

			RequestDispatcher rd = context.getRequestDispatcher("/entrada.jsp");
			request.setAttribute("operador", loginOperador);
	   		rd.forward(request, response);

		}
		
		if(opcaoSaida != null){

			RequestDispatcher rd = context.getRequestDispatcher("/saida.jsp");
			request.setAttribute("operador", loginOperador);
	   		rd.forward(request, response);

		}

	}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               processRequest(request, response);
          }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               processRequest(request, response);
    }
    
}
