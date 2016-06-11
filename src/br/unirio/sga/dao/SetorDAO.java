package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unirio.sga.model.Almoxarifado;
import br.unirio.sga.model.Setor;
import br.unirio.sga.persistence.JDBCConnection;

/**
 * Classe responsável por manipulação de dados da tabela Setor
 * @author liviapereira
 *
 */
public class SetorDAO {
	
	public static List<Setor> getTodosSetores() throws SQLException{
		String query = "SELECT * FROM Setor;";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		List<Setor> setores = new ArrayList<Setor>();
		while(result.next()){
			Setor setor = new Setor();
			setor.setId(result.getInt("setor_id"));
			setor.setAlmoxarifado(new Almoxarifado(result.getInt("almoxarifado_id")));
			setor.setCapacidade(result.getLong("capacidade"));
			setor.setNome(result.getString("nome"));
			setores.add(setor);
		}
		conexao.close();
		return setores;
	}
}
