package br.unirio.sga.service;

import java.sql.SQLException;
import java.util.List;

import br.unirio.sga.dao.AlmoxarifadoDAO;
import br.unirio.sga.model.Almoxarifado;

public class AlmoxarifadoService {

	public static List<Almoxarifado> recuperaListaAlmoxarifados() {
		try {
			return AlmoxarifadoDAO.getTodosAlmoxarifados();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
