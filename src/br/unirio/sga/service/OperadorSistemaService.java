package br.unirio.sga.service;

import java.sql.SQLException;

import br.unirio.sga.dao.OperadorSistemaDAO;

public class OperadorSistemaService {
	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = null;
		try {
			idOperador = OperadorSistemaDAO.getIdByLogin(loginOperador);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idOperador;
	}
}
