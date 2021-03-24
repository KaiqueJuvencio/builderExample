package com.kaiquedev.builders;

import com.kaiquedev.builders.interfaces.IPessoaBuilder;
import com.kaiquedev.models.Pessoa;

public class PessoaBuilder implements IPessoaBuilder{	
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
	

	public PessoaBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public PessoaBuilder setNomeMeio(String nomeMeio) {
		this.nomeMeio = nomeMeio;
		return this;
	}

	public PessoaBuilder setNomeFinal(String nomeFinal) {
		this.nomeFinal = nomeFinal;
		return this;
	}

	public PessoaBuilder setApelido(String apelido) {
		this.apelido = apelido;
		return this;
	}

	public PessoaBuilder setNomePai(String nomePai) {
		this.nomePai = nomePai;
		return this;
	}

	public PessoaBuilder setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
		return this;
	}

	public PessoaBuilder setIdade(Integer idade) {
		this.idade = idade;
		return this;
	}

	public PessoaBuilder setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	public PessoaBuilder setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public PessoaBuilder setProfissao(String profissao) {
		this.profissao = profissao;
		return this;
	}

	public PessoaBuilder setEmpresa(String empresa) {
		this.empresa = empresa;		
		return this;
	}

	public PessoaBuilder setCargo(String cargo) {
		this.cargo = cargo;
		return this;
	}
	
	public Pessoa criaPessoa() {
		return new Pessoa(nome, nomeMeio, nomeFinal, apelido, 
						  nomePai, nomeMae, idade, estado, 
						  cidade, profissao, empresa, cargo);				
	}		
}
