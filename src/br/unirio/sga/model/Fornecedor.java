package br.unirio.sga.model;

public class Fornecedor {

	private Integer id;
	private String cnpj;
	private String nome;
	private String telefone;
	private String codigo;
	private Endereco endereco;

	public Fornecedor(Integer id, String cnpj, String nome, String telefone, String codigo, Endereco endereco) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public Fornecedor() {

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}