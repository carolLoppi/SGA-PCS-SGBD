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
import br.unirio.sga.service.OperadorSistemaService;

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
		String senha = request.getParameter("senha");
		String nomeOperador = request.getParameter("nomeOperador");
		String idMaterial = request.getParameter("material");
		String idSetor = request.getParameter("setor");
		String idFornecedor = request.getParameter("fornecedor"); 
		Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
		Integer idOperador = OperadorSistemaService.recuperaIdOperador(loginOperador);
		
		Boolean sucesso = EntradaService.incluirMaterial(idMaterial, idSetor, idFornecedor, quantidade, idOperador);
		//TO-DO: Mensagem sucesso!
		//TO-DO: Mensagem insucesso!
		ServletContext context = getServletContext();
		if(sucesso) {
			request.setAttribute("entradaSucesso", true);
		}
		else {
			request.setAttribute("entradaSucesso", false);
		}
		request.setAttribute("login", loginOperador);
		request.setAttribute("senha", senha);
		request.setAttribute("nomeOperador", nomeOperador);
		request.setAttribute("inclusao", true);
		RequestDispatcher rd = context.getRequestDispatcher("/sucesso.jsp");
		rd.forward(request, response);
	}
	
}
