package br.unirio.sga.service;

import java.sql.SQLException;
import java.util.List;

import br.unirio.sga.dao.MaterialDAO;
import br.unirio.sga.model.Material;

public class MaterialService {

	public static List<Material> recuperarListaMateriais() {

		try {
			return MaterialDAO.getTodosMateriais();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
