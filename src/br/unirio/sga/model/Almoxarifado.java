package br.unirio.sga.model;

public class Almoxarifado {
	
	private Integer id;
	private String cnpj;
	private Endereco endereco;
	//falta lista de setores
	
	public Almoxarifado(Integer id, String cnpj, Endereco endereco) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}