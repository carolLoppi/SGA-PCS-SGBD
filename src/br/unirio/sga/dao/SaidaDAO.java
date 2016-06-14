package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import br.unirio.sga.persistence.JDBCConnection;

public class SaidaDAO {
	public static Boolean inserirSaida(Integer operadorId, Integer alocacaoId, String nomeDepartamento, Integer quantidade) throws SQLException {
		Date data = new Date();
		Timestamp dataOperacao = new Timestamp(data.getTime());

		String query = "INSERT INTO saida (operador_id, alocacao_id, nome_departamento, data_da_operacao, quantidade) VALUES ("
				+ operadorId + ", " + alocacaoId + ", '" + nomeDepartamento + "', '" + dataOperacao + "', " + quantidade +");";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		int resultUpdate = sql.executeUpdate(query);
		conexao.close();
		return (resultUpdate == 0 ? false : true);
	}
}
