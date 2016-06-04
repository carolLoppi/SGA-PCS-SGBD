package br.unirio.sga.model;

public class Setor {
	
	private Integer id;
	private Almoxarifado almoxarifado;
	private String nome;
	private Long capacidade;
	//falta lista de materiais alocados neste setor
	
	public Setor(Integer id, Almoxarifado almoxarifado, String nome, Long capacidade) {
		super();
		this.id = id;
		this.almoxarifado = almoxarifado;
		this.nome = nome;
		this.capacidade = capacidade;
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
}
