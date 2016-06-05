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


@WebServlet("/ServletSGA")
public class ServletSGA extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletSGA() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
	}
    
}
