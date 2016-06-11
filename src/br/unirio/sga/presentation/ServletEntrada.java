package br.unirio.sga.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unirio.sga.service.EntradaService;

/* 
 * Servlet responsável por atuar no processamento de entrada de material.
 */
@WebServlet("/ServletEntrada")
public class ServletEntrada extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public ServletEntrada(){
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String loginOperador = request.getParameter("login");
		String idMaterial = request.getParameter("material");
		String idSetor = request.getParameter("idSetor");
		Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
		Integer idOperador = EntradaService.recuperaIdOperador(loginOperador);
		
		Boolean sucesso = EntradaService.incluirMaterial(idMaterial, idSetor, quantidade, idOperador);
		//TO-DO: Mensagem sucesso!
		//TO-DO: Mensagem insucesso!
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/entrada.jsp"); 		//substituir por reload
		request.setAttribute("operador", loginOperador);
		rd.forward(request, response);
	}
	
}
