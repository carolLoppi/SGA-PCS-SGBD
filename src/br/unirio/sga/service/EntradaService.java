package br.unirio.sga.service;

import java.sql.SQLException;

import br.unirio.sga.dao.AlocacaoDAO;

public class EntradaService {

	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = AlocacaoDAO.getIdByLogin(loginOperador);
		return idOperador;
	}

	public static boolean incluirMaterial(String idMaterial, String idSetor, String idFornecedor, Integer quantidadeMaterial, Integer idOperador) {
		Boolean sucesso = null;
		try {
			sucesso = AlocacaoDAO.acrescentaQuantidadeMaterial(idMaterial, idSetor, idFornecedor, quantidadeMaterial, idOperador);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sucesso;
	}
}
