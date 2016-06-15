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
import br.unirio.sga.service.OperadorSistemaService;
import br.unirio.sga.service.AlocacaoService;

/* 
 * Servlet responsável por atuar no processamento de entrada de material.
 */
@WebServlet("/ServletVerificarDisponibilidade")
public class ServletVerificarDisponibilidade extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public ServletVerificarDisponibilidade(){
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String loginOperador = request.getParameter("login");
		String senha = request.getParameter("senha");
		String idMaterial = request.getParameter("material");
		Integer idOperador = OperadorSistemaService.recuperaIdOperador(loginOperador);
		String nomeOperador = request.getParameter("nomeOperador");
		
		List<Alocacao> alocacoes= AlocacaoService.verificarDisponibilidade(idMaterial);
		//TO-DO: Mensagem sucesso!
		//TO-DO: Mensagem insucesso!
		ServletContext context = getServletContext();
		if(alocacoes != null && alocacoes.size() != 0) {
			request.setAttribute("saidaSucesso", true);
			request.setAttribute("alocacoes", alocacoes);
		}
		else {
			request.setAttribute("saidaSucesso", false);
		}
		request.setAttribute("login", loginOperador);
		request.setAttribute("senha", senha);
		request.setAttribute("nomeOperador", nomeOperador);
		request.setAttribute("idOperador", idOperador);
		request.setAttribute("exclusao", true);
		RequestDispatcher rd = context.getRequestDispatcher("/escolhaSaida.jsp");
		rd.forward(request, response);
	}
	
}
