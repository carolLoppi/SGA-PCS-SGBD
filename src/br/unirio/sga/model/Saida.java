package br.unirio.sga.model;

import java.util.Date;

public class Saida {
	private Integer id;
	private OperadorSistema operador;
	private Alocacao alocacao;
	private Double quantidade;
	private String nomeDepartamento;
	private Date dataOperacao;
//	incluir material que será desalocado para então passar para alocação efetuar a operação
	
	public Saida(Integer id, OperadorSistema operador, Alocacao alocacao, Double quantidade, String nomeDepartamento,
			Date dataOperacao) {
		super();
		this.id = id;
		this.operador = operador;
		this.alocacao = alocacao;
		this.quantidade = quantidade;
		this.nomeDepartamento = nomeDepartamento;
		this.dataOperacao = dataOperacao;
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
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
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
