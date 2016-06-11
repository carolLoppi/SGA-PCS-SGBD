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
 * @author Caroline
 * Classe responsável por registrar entradas e saídas do sistema.
 *
 */


//TO-DO: uso da JDBCConnection.executaQuery
//TO-DO: apenas altera a coluna quantidade do material em alocacao
//Idem na saída, o material não deve ser deletado.
//devemos antes verificar se há a quantidade necessária a ser removida.
// A PRINCIPIO CAMPO FORNECEDOR PODE SER IGUAL A "INTERNO" APENAS 
//LEIA-SE SO ATUALIZA CASO EXISTA O REGISTRO OU ACRESCENTA QUANT CASO NAO E SE FOR OUTRO OPERADOR, OUTRO REGISTRO

public class AlocacaoDAO {

	//Example Code:
	//
	//Connection connection = JDBCConnection.get();
	//Statement sql = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	//sql.executeQuery("query em SQL puro aqui";"); 
	//sql.close();


	public static Integer getIdByLogin(String loginOperador) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Boolean acrescentaQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id) throws SQLException{
		//se material já inserido em alocacao (com mesmo setor ), atualiza a quantidade
		
		//senão, inserir.
		//TODO verificar auto incremento de chave aqui
		String query = "INSERT INTO alocacao (alocacao_id, fornecedor_id, material_id, setor_id, quantidade) VALUES(1,) ;";
		Connection conexao = JDBCConnection.getConnection();
		Statement sql = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		int result = sql.executeUpdate(query);
		
		conexao.close();
		
		return (result == 0 ? false : true);
	}

	public static Boolean decresceQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id, String departamentoId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean verificaQuantidadeMaterial(String materialId, String setorId, Integer quantidade, Integer id, String departamentoId) {
		// TODO Auto-generated method stub
		return null;		
	}

}



