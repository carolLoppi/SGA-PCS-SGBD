package br.unirio.sga.service;

import br.unirio.sga.dao.AlocacaoDAO;

	public class SaidaService {
		public static Integer recuperaIdOperador(String loginOperador) {
			Integer idOperador = AlocacaoDAO.getIdByLogin(loginOperador);
			return idOperador;
		}
	
		public static boolean removerMaterial(String material, String setor, Integer quantidade, Integer id, String departamento) {
				
			Boolean sucesso = AlocacaoDAO.decresceQuantidadeMaterial(material, setor, quantidade, id, departamento);
			return sucesso;
		}	
}
