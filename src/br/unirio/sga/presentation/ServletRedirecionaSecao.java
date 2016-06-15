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

import br.unirio.sga.model.Almoxarifado;
import br.unirio.sga.model.Material;
import br.unirio.sga.service.AlmoxarifadoService;
import br.unirio.sga.service.MaterialService;

@WebServlet("/ServletRedirecionaSecao")
public class ServletRedirecionaSecao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRedirecionaSecao() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opcaoEntrada = request.getParameter("entrada");
		String opcaoSaida = request.getParameter("saida");
		String loginOperador = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nomeOperador = request.getParameter("nomeOperador");
		List<Material> materiais = MaterialService.recuperarListaMateriais();

		if (materiais != null) {
			request.setAttribute("materiais", materiais);
		} else {
			request.setAttribute("materiais", "Lista vazia!");
		}
		ServletContext context = getServletContext();

		if (opcaoEntrada != null) {
			List<Almoxarifado> almoxarifados = AlmoxarifadoService.recuperaListaAlmoxarifados();
			if (almoxarifados != null) {
				request.setAttribute("almoxarifados", almoxarifados);
			} else {
				request.setAttribute("almoxarifados", "Lista vazia!");
			}
			RequestDispatcher rd = context.getRequestDispatcher("/escolhaAlmoxarifado.jsp");
			request.setAttribute("login", loginOperador);
			request.setAttribute("senha", senha);
			request.setAttribute("nomeOperador", nomeOperador);
			rd.forward(request, response);
		}
		if (opcaoSaida != null) {
			RequestDispatcher rd = context.getRequestDispatcher("/saida.jsp");
			request.setAttribute("login", loginOperador);
			request.setAttribute("senha", senha);
			request.setAttribute("nomeOperador", nomeOperador);
//			Integer idOperador = OperadorSistemaService.recuperaIdOperador(loginOperador);
//			request.setAttribute("idOperador", idOperador);
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
