package br.unirio.sga.model;

public class OperadorSistema {
	private Integer id;
	private String nome;
	private String cpf;
	private String login;
	private String senha;

	public OperadorSistema(Integer id, String nome, String cpf, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
