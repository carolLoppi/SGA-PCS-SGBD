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

public class AlmoxarifadoDAO {

	public static List<Almoxarifado> getTodosAlmoxarifados() throws SQLException{
		String query = "SELECT * FROM almoxarifado";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		
		List<Almoxarifado> almoxarifados = new ArrayList<Almoxarifado>();
		while(result.next()){
			Almoxarifado almoxarifado = new Almoxarifado();
			almoxarifado.setId(result.getInt("almoxarifado_id"));
			almoxarifado.setCodigo(result.getString("codigo"));
			almoxarifados.add(almoxarifado);
		}
		conexao.close();
		return almoxarifados;
	}

	public static String getCodigoAlmoxarifadoById(Integer id) throws SQLException {
		String query = "SELECT * FROM Almoxarifado where almoxarifado_id=" + id +";";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = sql.executeQuery(query);
		Almoxarifado almoxarifado = new Almoxarifado();
		while(result.next()){
			almoxarifado.setCodigo(result.getString("codigo"));
		}
		conexao.close();
		return almoxarifado.getCodigo();
	}
}
