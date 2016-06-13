package br.unirio.sga.model;

/*
 * Classe responsável por efetuar transações de entrada e saída de materiais do sistema
 */

public class Alocacao {
	private Integer id;
	private Material material;
	private Setor setor;
	private Integer quantidade;
	private Fornecedor fornecedor;
	
	

	public Alocacao(Integer id, Material material, Setor setor, Integer quantidade, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.material = material;
		this.setor = setor;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
	}

	public Alocacao() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	

}
