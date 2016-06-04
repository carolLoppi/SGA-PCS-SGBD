package br.unirio.sga.model;

public class Material {
	
	private Integer id;
	private String codigo;
	private String descricao;
	private String unidadeDeMedida;
	private Double precoDeMercado;
	
	public Material(Integer id, String codigo, String descricao, String unidadeDeMedida, Double precoDeMercado) {
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidadeDeMedida = unidadeDeMedida;
		this.precoDeMercado = precoDeMercado;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public Double getPrecoDeMercado() {
		return precoDeMercado;
	}
	public void setPrecoDeMercado(Double precoDeMercado) {
		this.precoDeMercado = precoDeMercado;
	}
	
	
}