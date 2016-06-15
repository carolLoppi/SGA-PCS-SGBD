package br.unirio.sga.service;

import java.sql.SQLException;
import java.util.List;

import br.unirio.sga.dao.SetorDAO;
import br.unirio.sga.model.Setor;

public class SetorService {
	public static List<Setor> recuperarListaSetores(Integer idAlmoxarifado) {
		try {
			return SetorDAO.getTodosSetores(idAlmoxarifado);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
