package br.unirio.sga.model;


import java.util.Date;

public class Entrada {
	private Integer id;
	private Alocacao alocacao;
	private OperadorSistema operador;
	private Date dataOperacao;
	private Integer quantidade;
	
	
	
	
	public Entrada(Integer id, Alocacao alocacao, OperadorSistema operador, Date dataOperacao, Integer quantidade) {
		super();
		this.id = id;
		this.alocacao = alocacao;
		this.operador = operador;
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
	public Alocacao getAlocacao() {
		return alocacao;
	}
	public void setAlocacao(Alocacao alocacao) {
		this.alocacao = alocacao;
	}
	public Date getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public OperadorSistema getOperador() {
		return operador;
	}
	public void setOperador(OperadorSistema operador) {
		this.operador = operador;
	}
	
}
