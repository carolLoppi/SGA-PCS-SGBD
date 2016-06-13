package br.unirio.sga.service;

import java.sql.SQLException;
import java.util.List;

import br.unirio.sga.dao.AlocacaoDAO;
import br.unirio.sga.dao.OperadorSistemaDAO;
import br.unirio.sga.model.Alocacao;

public class VerificarDisponibilidadeService {
	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = null;
		try {
			idOperador = OperadorSistemaDAO.getIdByLogin(loginOperador);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idOperador;
	}

	public static List<Alocacao> verificarDisponibilidade(String idMaterial) {
		List<Alocacao> alocacoes = null;
		try {
			alocacoes = AlocacaoDAO.verificarDisponibilidadeMaterial(idMaterial);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alocacoes;
	}
}
