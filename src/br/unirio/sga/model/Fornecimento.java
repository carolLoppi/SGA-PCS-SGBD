package br.unirio.sga.model;

import java.util.Date;

public class Fornecimento {
	
	private Integer id;
	private Fornecedor fornecedor;
	private Material material;
	private Double precoUnitario;
	private String numeroNotaFiscal;
	private Date data_fornecimento;
	private Double quantidade;
	
	public Fornecimento(Integer id, Fornecedor fornecedor, Material material, Double precoUnitario,
			String numeroNotaFiscal, Date data_fornecimento, Double quantidade) {
		super();
		this.id = id;
		this.fornecedor = fornecedor;
		this.material = material;
		this.precoUnitario = precoUnitario;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.data_fornecimento = data_fornecimento;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Date getData_fornecimento() {
		return data_fornecimento;
	}

	public void setData_fornecimento(Date data_fornecimento) {
		this.data_fornecimento = data_fornecimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
}
