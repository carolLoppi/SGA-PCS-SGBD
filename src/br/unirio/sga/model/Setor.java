package br.unirio.sga.model;

import java.util.List;

public class Setor {
	
	private Integer id;
	private Almoxarifado almoxarifado;
	private String nome;
	private Long capacidade;
	private List<Material> materiais;
	
	public Setor(Integer id, Almoxarifado almoxarifado, String nome, Long capacidade) {
		this.id = id;
		this.almoxarifado = almoxarifado;
		this.nome = nome;
		this.capacidade = capacidade;
	}
	
	public Setor() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}
	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Long capacidade) {
		this.capacidade = capacidade;
	}

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}	
	
}
