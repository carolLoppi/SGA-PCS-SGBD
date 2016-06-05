package br.unirio.sga.model;

public class Alocacao {
	private Integer id;
	private Material material;
	private Setor setor;
	private Double quantidade;
	private Fornecedor fornecedor;

	

	public Alocacao(Integer id, Material material, Setor setor, Double quantidade, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.material = material;
		this.setor = setor;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
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

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	

}
