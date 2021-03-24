package com.kaiquedev.models;

public class Pessoa {
	private String nome;
	private String nomeMeio;
	private String nomeFinal;
	private String apelido;
	private String nomePai;
	private String nomeMae;
	private Integer idade;
	private String estado;
	private String cidade;
	private String profissao;
	private String empresa;
	private String cargo;
	
	public Pessoa(String nome, String nomeMeio, String nomeFinal, String apelido, String nomePai, String nomeMae,
			Integer idade, String estado, String cidade, String profissao, String empresa, String cargo) {
		super();
		this.nome = nome;
		this.nomeMeio = nomeMeio;
		this.nomeFinal = nomeFinal;
		this.apelido = apelido;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.idade = idade;
		this.estado = estado;
		this.cidade = cidade;
		this.profissao = profissao;
		this.empresa = empresa;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMeio() {
		return nomeMeio;
	}
	public void setNomeMeio(String nomeMeio) {
		this.nomeMeio = nomeMeio;
	}
	public String getNomeFinal() {
		return nomeFinal;
	}
	public void setNomeFinal(String nomeFinal) {
		this.nomeFinal = nomeFinal;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nomeMeio=" + nomeMeio + ", nomeFinal=" + nomeFinal + ", apelido=" + apelido
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", idade=" + idade + ", estado=" + estado
				+ ", cidade=" + cidade + ", profissao=" + profissao + ", empresa=" + empresa + ", cargo=" + cargo + "]";
	}	
}
