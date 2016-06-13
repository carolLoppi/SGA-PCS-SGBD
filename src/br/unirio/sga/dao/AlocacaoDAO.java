package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unirio.sga.model.Alocacao;
import br.unirio.sga.model.Fornecedor;
import br.unirio.sga.model.Material;
import br.unirio.sga.model.Setor;
import br.unirio.sga.persistence.JDBCConnection;

/**
 * 
 * @author Caroline Classe responsável por registrar entradas e saídas do
 *         sistema.
 *
 */

// TO-DO: uso da JDBCConnection.executaQuery
// TO-DO: apenas altera a coluna quantidade do material em alocacao
// Idem na saída, o material não deve ser deletado.
// devemos antes verificar se há a quantidade necessária a ser removida.
// A PRINCIPIO CAMPO FORNECEDOR PODE SER IGUAL A "INTERNO" APENAS
// LEIA-SE SO ATUALIZA CASO EXISTA O REGISTRO OU ACRESCENTA QUANT CASO NAO E SE
// FOR OUTRO OPERADOR, OUTRO REGISTRO

public class AlocacaoDAO {

	// Example Code:
	//
	// Connection connection = JDBCConnection.get();
	// Statement sql =
	// connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	// ResultSet.CONCUR_READ_ONLY);
	// sql.executeQuery("query em SQL puro aqui";");
	// sql.close();

	@SuppressWarnings("resource")
	public static Boolean acrescentaQuantidadeMaterial(String materialId, String setorId, String fornecedorId,
			Integer quantidade, Integer operadorId) throws SQLException {
		int resultUpdate;
		Integer quantidadeAnterior = null;

		// verifica se material já alocado com mesmo fornecedor e setor
		quantidadeAnterior = verificaQuantidadeMaterial(materialId, setorId, fornecedorId);

		// se sim, atualiza a quantidade na tabela alocacao
		if (quantidadeAnterior != null) {
			quantidade = quantidade + quantidadeAnterior;
			String query2 = "UPDATE alocacao SET quantidade=" + (quantidade) + " WHERE fornecedor_id=" + fornecedorId
					+ "AND material_id=" + materialId + " AND setor_id=" + setorId + ";";
			Connection conexao2 = JDBCConnection.getConnection();
			Statement sql = conexao2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultUpdate = sql.executeUpdate(query2);
			conexao2.close();
		}
		// senão, inserir na tabela alocacao
		else {
			String query3 = "INSERT INTO alocacao (fornecedor_id, material_id, setor_id, quantidade) VALUES("
					+ fornecedorId + "," + materialId + "," + setorId + "," + quantidade + ");";
			Connection conexao3 = JDBCConnection.getConnection();
			Statement sql = conexao3.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultUpdate = sql.executeUpdate(query3);
			conexao3.close();
		}
		Integer alocacaoId = recuperarIdAlocacao(materialId, fornecedorId, setorId);
		EntradaDAO.inserirEntrada(alocacaoId, quantidade, operadorId);
		return (resultUpdate == 0 ? false : true);
	}

	private static Integer recuperarIdAlocacao(String materialId, String fornecedorId, String setorId)
			throws SQLException {
		Integer alocacaoId = null;
		String query1 = "SELECT alocacao_id FROM alocacao WHERE fornecedor_id=" + fornecedorId + "AND material_id="
				+ materialId + " AND setor_id=" + setorId + ";";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query1);
		while (result.next()) {
			alocacaoId = (result.getInt("alocacao_id") == 0 ? null : result.getInt("alocacao_id"));
		}
		conexao.close();
		return alocacaoId;
	}

	public static Boolean decresceQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id,
			String departamentoId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Integer verificaQuantidadeMaterial(String materialId, String setorId, String fornecedorId)
			throws SQLException {
		Integer quantidadeAnterior = null;
		String query1 = "SELECT quantidade FROM alocacao WHERE fornecedor_id=" + fornecedorId + "AND material_id="
				+ materialId + " AND setor_id=" + setorId + ";";
		Connection conexao1 = JDBCConnection.getConnection();
		Statement sql = conexao1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query1);
		while (result.next()) {
			quantidadeAnterior = (result.getInt("quantidade") == 0 ? null : result.getInt("quantidade"));
		}
		conexao1.close();
		return quantidadeAnterior;
	}

	/**
	 * Função para verificar a disponibilidade do material em alocacao, em um
	 * processo de Saida
	 * 
	 * @param idMaterial
	 * @return Lista de Alocacao contendo todas as occorrencias do Material em
	 *         Alocacao
	 * @throws SQLException
	 */
	public static List<Alocacao> verificarDisponibilidadeMaterial(String idMaterial) throws SQLException {
		String query = "SELECT fornecedor_id, alocacao_id, setor_id, quantidade FROM alocacao WHERE material_id = "
				+ idMaterial + ";";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);

		List<Alocacao> alocacoes = new ArrayList<Alocacao>();
		while (result.next()) {
			Fornecedor fornecedor;
			Setor setor;
			Material material;
			Alocacao alocacao = new Alocacao();

			Integer setorId = (result.getInt("setor_id"));
			setor = SetorDAO.getSetorById(setorId);

			Integer fornecedorId = result.getInt("fornecedor_id");
			fornecedor = FornecedorDAO.getFornecedorById(fornecedorId);

			material = MaterialDAO.getMaterialById(idMaterial);

			alocacao.setId(result.getInt("alocacao_id"));
			alocacao.setFornecedor(fornecedor);
			alocacao.setQuantidade(result.getInt("quantidade"));
			alocacao.setSetor(setor);
			alocacao.setMaterial(material);

			alocacoes.add(alocacao);
		}
		conexao.close();
		return alocacoes;
	}

}
