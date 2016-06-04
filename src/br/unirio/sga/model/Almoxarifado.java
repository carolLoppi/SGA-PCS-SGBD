package br.unirio.sga.model;

import java.util.List;

public class Almoxarifado {
	
	private Integer id;
	private String cnpj;
	private Endereco endereco;
	private List<Setor> setores;
	
	public Almoxarifado(Integer id, String cnpj, Endereco endereco) {
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

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}	

}