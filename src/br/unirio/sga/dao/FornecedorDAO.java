package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unirio.sga.model.Fornecedor;
import br.unirio.sga.persistence.JDBCConnection;

public class FornecedorDAO {
	public static List<Fornecedor> getTodosFornecedores() throws SQLException{
		String query = "SELECT * FROM Fornecedor;";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		while(result.next()){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setId(result.getInt("fornecedor_id"));
			fornecedor.setCnpj(result.getString("cnpj"));
			fornecedor.setNome(result.getString("nome"));
			fornecedor.setTelefone(result.getString("telefone"));
			fornecedor.setCodigo(result.getString("codigo"));
			fornecedores.add(fornecedor);
		}
		conexao.close();
		return fornecedores;
	}

	public static Fornecedor getFornecedorById(Integer fornecedorId) throws SQLException {
		String query = "SELECT * FROM Fornecedor where fornecedor_id = " + fornecedorId + ";";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		Fornecedor fornecedor = new Fornecedor();

		while(result.next()){
			fornecedor.setId(result.getInt("fornecedor_id"));
			fornecedor.setCnpj(result.getString("cnpj"));
			fornecedor.setNome(result.getString("nome"));
			fornecedor.setTelefone(result.getString("telefone"));
			fornecedor.setCodigo(result.getString("codigo"));
		}
		conexao.close();
		return fornecedor;
	}
}
