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

import br.unirio.sga.model.Fornecedor;
import br.unirio.sga.model.Material;
import br.unirio.sga.model.Setor;
import br.unirio.sga.service.FornecedorService;
import br.unirio.sga.service.MaterialService;
import br.unirio.sga.service.SetorService;

@WebServlet("/ServletRedirecionaEntrada")
public class ServletRedirecionaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRedirecionaEntrada() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String loginOperador = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nomeOperador = request.getParameter("nomeOperador");
		Integer idAlmoxarifado = Integer.parseInt(request.getParameter("idAlmoxarifado"));
		List<Material> materiais = MaterialService.recuperarListaMateriais();


		if (materiais != null) {
			request.setAttribute("materiais", materiais);
		} else {
			request.setAttribute("materiais", "Lista vazia!");
		}
		ServletContext context = getServletContext();

			List<Setor> setores = SetorService.recuperarListaSetores(idAlmoxarifado);
			List<Fornecedor> fornecedores = FornecedorService.recuperarListaFornecedores();
			
			if (setores != null) {
				request.setAttribute("setores", setores);
			} else {
				request.setAttribute("setores", "Lista vazia!");
			}

			if (fornecedores != null) {
				request.setAttribute("fornecedores", fornecedores);
			} else {
				request.setAttribute("fornecedores", "Lista vazia!");
			}
			
			RequestDispatcher rd = context.getRequestDispatcher("/entrada.jsp");
			request.setAttribute("login", loginOperador);
			request.setAttribute("senha", senha);
			request.setAttribute("nomeOperador", nomeOperador);
			rd.forward(request, response);
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
