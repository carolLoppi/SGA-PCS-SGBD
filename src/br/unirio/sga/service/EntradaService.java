package br.unirio.sga.service;

import java.sql.SQLException;

import br.unirio.sga.dao.AlocacaoDAO;

public class EntradaService {

	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = AlocacaoDAO.getIdByLogin(loginOperador);
		return idOperador;
	}

	public static boolean incluirMaterial(String material, String setor, Integer quantidade, Integer id) {

		Boolean sucesso = null;
		try {
			sucesso = AlocacaoDAO.acrescentaQuantidadeMaterial(material, setor, quantidade, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sucesso;
	}
}
