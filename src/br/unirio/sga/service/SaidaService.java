package br.unirio.sga.service;

import java.sql.SQLException;

import br.unirio.sga.dao.AlocacaoDAO;
import br.unirio.sga.dao.OperadorSistemaDAO;

public class SaidaService {
	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = null;
		try {
			idOperador = OperadorSistemaDAO.getIdByLogin(loginOperador);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idOperador;
	}

	public static boolean removerMaterial(String material, String setor, Integer quantidade, Integer id,
			String departamento) {

		Boolean sucesso = AlocacaoDAO.decresceQuantidadeMaterial(material, setor, quantidade, id, departamento);
		return sucesso;
	}
}
