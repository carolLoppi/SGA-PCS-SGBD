package br.unirio.sga.model;

import java.util.List;

public class Almoxarifado {

	private Integer id;
	private String codigo;
	private Endereco endereco;
	private List<Setor> setores;

	public Almoxarifado(Integer id, String cod, Endereco endereco, List<Setor> setores) {
		super();
		this.id = id;
		this.codigo = cod;
		this.endereco = endereco;
		this.setores = setores;
	}
	
	
	
	
	public Almoxarifado(Integer id, String codigo) {
		super();
		this.id = id;
		this.codigo = codigo;
	}




	public Almoxarifado() {
		super();
	}


	public Almoxarifado(Integer id) {
		super();
		this.id = id;
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

	public void setCodigo(String cod) {
		this.codigo = cod;
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