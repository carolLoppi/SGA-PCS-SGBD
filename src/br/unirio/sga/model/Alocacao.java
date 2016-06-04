package br.unirio.sga.model;

public class Alocacao {
	private Integer id;
	private Material material;
	private Setor setor;
	private Double quantidade;

	public Alocacao(Integer id, Material material, Setor setor, Double quantidade) {
		this.id = id;
		this.material = material;
		this.setor = setor;
		this.quantidade = quantidade;
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

}
