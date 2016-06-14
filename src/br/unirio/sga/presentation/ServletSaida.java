package br.unirio.sga.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unirio.sga.service.SaidaService;

/* 
 * Servlet responsável por atuar no processamento de saída de material.
 */
@WebServlet("/ServletSaida")
public class ServletSaida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletSaida() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String loginOperador = request.getParameter("login");
		String departamentoDestino = request.getParameter("departamentoDestino");
		Integer alocacaoId = Integer.parseInt(request.getParameter("alocacaoId"));
		Integer quantidadeSaida = Integer.parseInt(request.getParameter("quantidadeSaida"));
		Integer quantidadeDisponivel = Integer.parseInt(request.getParameter("quantidadeDisponivel"));
		Integer idOperador = Integer.parseInt(request.getParameter("idOperador"));

		RequestDispatcher rd;
		if (quantidadeSaida > quantidadeDisponivel) {
			request.setAttribute("quantidadeInvalida", true);
			ServletContext context = getServletContext();
			rd = context.getRequestDispatcher("/escolhaSaida.jsp");
		} else {
			Boolean sucesso = SaidaService.registrarSaida(alocacaoId, idOperador, departamentoDestino, quantidadeSaida, quantidadeDisponivel);
			ServletContext context = getServletContext();
			if (sucesso) {
				request.setAttribute("saidaSucesso", true);
			} else {
				request.setAttribute("saidaSucesso", false);
			}
			request.setAttribute("operador", loginOperador);
			request.setAttribute("saida", true);
			rd = context.getRequestDispatcher("/sucesso.jsp");

		}
		rd.forward(request, response);
	}
}
