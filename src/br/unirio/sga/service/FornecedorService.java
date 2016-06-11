package br.unirio.sga.service;

import java.sql.SQLException;
import java.util.List;

import br.unirio.sga.dao.FornecedorDAO;
import br.unirio.sga.model.Fornecedor;

public class FornecedorService {

	public static List<Fornecedor> recuperarListaFornecedores() {
		try {
			return FornecedorDAO.getTodosFornecedores();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
