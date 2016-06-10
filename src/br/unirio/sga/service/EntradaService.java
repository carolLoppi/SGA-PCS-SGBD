package br.unirio.sga.service;

import br.unirio.sga.dao.AlocacaoDAO;

public class EntradaService {

	public static Integer recuperaIdOperador(String loginOperador) {
		Integer idOperador = AlocacaoDAO.getIdByLogin(loginOperador);
		return idOperador;
	}

	public static boolean incluirMaterial(String material, String setor, Integer quantidade, Integer id) {
			
		Boolean sucesso = AlocacaoDAO.acrescentaQuantidadeMaterial(material, setor, quantidade, id);
		return sucesso;
	}
}
