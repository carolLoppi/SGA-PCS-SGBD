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

	public static boolean registrarSaida(Integer alocacaoId, Integer idOperador, String departamentoDestino,
			Integer quantidadeSaida, Integer quantidadeDisponivel) {

		Boolean sucesso = null;
		try {
			sucesso = AlocacaoDAO.decresceQuantidadeMaterial(alocacaoId, idOperador, departamentoDestino,
					quantidadeSaida, quantidadeDisponivel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sucesso;
	}
}
