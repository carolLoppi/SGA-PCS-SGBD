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

import br.unirio.sga.service.LoginService;

@WebServlet("/ServletAutenticador")
public class ServletAutenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ServletAutenticador(){
        super();
    }
	//TO-DO: redirecionar para páginas seguintes do fluxo a depender do resultado
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nomeOperador = LoginService.autenticaOperador(login, senha);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(nomeOperador != null)
			out.println("Bem Vindo<h3>"+nomeOperador+":  \nLogin: " +login+"</h3>");
		else
			out.println("Hmm, não autenticado. Você será redirecionado para a página de login");
		out.close();
//		ServletContext context = getServletContext();
//		RequestDispatcher rd = context.getRequestDispatcher("/sucesso.jsp");
//		rd.forward(request, response);

	}
}