package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.unirio.sga.model.Alocacao;
import br.unirio.sga.model.Fornecedor;
import br.unirio.sga.model.Material;
import br.unirio.sga.model.OperadorSistema;
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

	public static Integer getIdByLogin(String loginOperador) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("resource")
	public static Boolean acrescentaQuantidadeMaterial(String materialId, String setorId, String fornecedorId,
			Integer quantidade, Integer id) throws SQLException {

		Integer quantidadeAnterior = null;
		int resultUpdate;
		// verifica se material já inserido em alocacao (com mesmo setor e
		// fornecedor)
		String query1 = "SELECT quantidade FROM alocacao WHERE fornecedor_id=" + fornecedorId + "AND material_id="
				+ materialId + " AND setor_id=" + setorId + ";";
		Connection conexao1 = JDBCConnection.getConnection();
		Statement sql = conexao1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query1);
		while (result.next()) {
			quantidadeAnterior = (result.getInt("quantidade") == 0 ? null : result.getInt("quantidade"));
		}
		conexao1.close();

		// se sim, atualiza a quantidade
		if (quantidadeAnterior != null) {
			String query2 = "UPDATE alocacao SET quantidade=" + (quantidade + quantidadeAnterior) + " WHERE fornecedor_id="
					+ fornecedorId + "AND material_id=" + materialId + " AND setor_id=" + setorId + ";";
			Connection conexao2 = JDBCConnection.getConnection();
			sql = conexao2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultUpdate = sql.executeUpdate(query2);
			conexao2.close();
		}
		// senão, inserir
		else {
			String query3 = "INSERT INTO alocacao (fornecedor_id, material_id, setor_id, quantidade) VALUES(" + fornecedorId
					+ "," + materialId + "," + setorId + "," + quantidade + ");";
			Connection conexao3 = JDBCConnection.getConnection();
			sql = conexao3.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultUpdate = sql.executeUpdate(query3);
			conexao3.close();
		}
		return (resultUpdate == 0 ? false : true);
	}

	public static Boolean decresceQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id,
			String departamentoId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Boolean verificaQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id,
			String departamentoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
