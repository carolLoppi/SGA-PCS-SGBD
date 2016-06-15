package br.unirio.sga.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unirio.sga.model.Alocacao;
import br.unirio.sga.service.AlocacaoService;
import br.unirio.sga.service.LoginService;

@WebServlet("/ServletAutenticador")
public class ServletAutenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ServletAutenticador(){
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nomeOperador = LoginService.autenticaOperador(login, senha);
		//response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();

		if(nomeOperador != null)
		{
			List<Alocacao> alocacoes= AlocacaoService.getTodasAlocacoes();
			RequestDispatcher rd = context.getRequestDispatcher("/sucesso.jsp");
			request.setAttribute("nomeOperador", nomeOperador);
			request.setAttribute("login", login);
			request.setAttribute("senha", senha);
			request.setAttribute("alocacoes", alocacoes);
			
			rd.forward(request, response);

		}
		else{
			RequestDispatcher rd = context.getRequestDispatcher("/login.jsp");
			request.setAttribute("loginInvalido", true);
			rd.forward(request, response);

		}
//		out.close();
	

	}
}