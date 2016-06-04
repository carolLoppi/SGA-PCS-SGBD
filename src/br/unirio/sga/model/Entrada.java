package br.unirio.sga.model;


import java.util.Date;

public class Entrada {
	private Integer id;
	private Alocacao alocacao;
	private OperadorSistema operador;
	private Date dataOperacao;
	private Double quantidadeMaterial;
	//incluir material que será alocado para então passar para alocação efetuar a operação
	
	public Entrada(Integer id, Alocacao alocacao, OperadorSistema operador, Date dataOperacao,
			Double quantidadeMaterial) {
		super();
		this.id = id;
		this.alocacao = alocacao;
		this.operador = operador;
		this.dataOperacao = dataOperacao;
		this.quantidadeMaterial = quantidadeMaterial;
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
	public Double getQuantidadeMaterial() {
		return quantidadeMaterial;
	}
	public void setQuantidadeMaterial(Double quantidadeMaterial) {
		this.quantidadeMaterial = quantidadeMaterial;
	}
	public OperadorSistema getOperador() {
		return operador;
	}
	public void setOperador(OperadorSistema operador) {
		this.operador = operador;
	}
	
	
}
