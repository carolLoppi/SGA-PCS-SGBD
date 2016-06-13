package br.unirio.sga.model;

import java.util.Date;

public class Saida {
	private Integer id;
	private OperadorSistema operador;
	private Alocacao alocacao;
	private String nomeDepartamento;
	private Date dataOperacao;
	private Integer quantidade;
	
	
	public Saida(Integer id, OperadorSistema operador, Alocacao alocacao, String nomeDepartamento, Date dataOperacao,
			Integer quantidade) {
		super();
		this.id = id;
		this.operador = operador;
		this.alocacao = alocacao;
		this.nomeDepartamento = nomeDepartamento;
		this.dataOperacao = dataOperacao;
		this.quantidade = quantidade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OperadorSistema getOperador() {
		return operador;
	}
	public void setOperador(OperadorSistema operador) {
		this.operador = operador;
	}
	public Alocacao getAlocacao() {
		return alocacao;
	}
	public void setAlocacao(Alocacao alocacao) {
		this.alocacao = alocacao;
	}
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public Date getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	
	
	
}
