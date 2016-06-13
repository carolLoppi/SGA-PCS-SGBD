package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unirio.sga.model.Material;
import br.unirio.sga.persistence.JDBCConnection;

/**
 * Classe responsável por manipulação de dados da tabela Material
 * @author liviapereira
 *
 */
public class MaterialDAO {
	
	public static List<Material> getTodosMateriais() throws SQLException{
		String query = "SELECT * FROM material";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		List<Material> materiais = new ArrayList<Material>();
		while(result.next()){
			Material material = new Material();
			material.setId(result.getInt("material_id"));
			material.setCodigo(result.getString("codigo"));
			material.setDescricao(result.getString("descricao"));
			material.setUnidadeDeMedida(result.getString("unidade_de_medida"));
			material.setPrecoDeMercado(result.getDouble("preco_de_mercado"));
			materiais.add(material);
		}
		conexao.close();
		return materiais;
	}

	public static Material getMaterialById(String idMaterial) throws SQLException {
		String query = "SELECT * FROM material where material_id = " + idMaterial + ";";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		Material material = new Material();

		while(result.next()){
			material.setId(result.getInt("material_id"));
			material.setCodigo(result.getString("codigo"));
			material.setDescricao(result.getString("descricao"));
			material.setUnidadeDeMedida(result.getString("unidade_de_medida"));
			material.setPrecoDeMercado(result.getDouble("preco_de_mercado"));
		}
		conexao.close();
		return material;
	}
}
