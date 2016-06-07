package br.unirio.sga.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import br.unirio.sga.model.Alocacao;
import br.unirio.sga.model.Fornecedor;
import br.unirio.sga.model.Material;
import br.unirio.sga.model.OperadorSistema;
import br.unirio.sga.model.Setor;

/**
 * 
 * @author Caroline
 * Classe responsável por registrar entradas e saídas do sistema, bem como atualizar os dados dos materiais
 *
 */


//TO-DO: refatorar classe para uso da JDBCConnection.executaQuery
public class AlocacaoDAO {

	public boolean insere(Material material, Alocacao alocacao, OperadorSistema operador, Date dataDaOperacao){
		
		try{
//			
//			Connection connection = ConnectionFactory.get();
//			Statement sql = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			
//			sql.executeQuery("INSERT INTO entrada(entrada_id, alocacao_id, data_da_operacao, operador_id) VALUES " + alocacao.getId() + ", " + alocacao.getId() + ", " + dataDaOperacao + ", " + operador.getId() + ";"); 
//			
//			for(int i =0; i<alocacao.getQuantidade(); i++){
//				
//				sql.executeQuery("INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) " + "VALUES " + material.getId() + ", " + material.getCodigo() + ", " + material.getDescricao() + ", " + material.getUnidadeDeMedida() + ", " + material.getPrecoDeMercado() + ";"); 
//
//			}
//
//			sql.close();
			return true;
		
		}
		catch (Exception e){
			
			return false;
		}
		
	}
	
	public boolean remove(Material material, Alocacao alocacao, OperadorSistema operador, String nomeDepartamento, Date dataDaOperacao){
		

		try{
//			
//			Connection connection = ConnectionFactory.get();
//			Statement sql = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//
//			sql.executeQuery("INSERT INTO saida(saida_id, operador_id, alocacao_id, nome_departamento, data_da_operacao) VALUES " + alocacao.getId() + ", " + operador.getId() + "," + alocacao.getId() + ", " + nomeDepartamento + ", " + dataDaOperacao + ";"); 
//			
//			for(int i =0; i<alocacao.getQuantidade(); i++){
//				
//				sql.executeQuery("DELETE FROM material WHERE id = " + material.getId() + ";"); 
//
////			}
//
//			sql.close();
			return true;
		
		}
		catch (Exception e){
			
			return false;
		}
		
	}

}
