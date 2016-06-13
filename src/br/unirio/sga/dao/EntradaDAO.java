package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import br.unirio.sga.persistence.JDBCConnection;

public class EntradaDAO {

	public static Boolean inserirEntrada(Integer alocacaoId, Integer quantidade, Integer operadorId) throws SQLException {
		Date data = new Date();
		Timestamp dataOperacao = new Timestamp(data.getTime());

		String query = "INSERT INTO entrada (alocacao_id, quantidade, data_da_operacao, operador_id) VALUES ("
				+ alocacaoId + ", " + quantidade + ", '" + dataOperacao + "', " + operadorId + ");";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		int resultUpdate = sql.executeUpdate(query);
		conexao.close();
		return (resultUpdate == 0 ? false : true);
	}
}
