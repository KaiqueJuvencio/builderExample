package com.kaiquedev.builders.interfaces;

import com.kaiquedev.builders.PessoaBuilder;

public interface IPessoaBuilder {
	PessoaBuilder setNome(String nome);
	PessoaBuilder setNomeMeio(String nomeMeio);
	PessoaBuilder setNomeFinal(String nomeFinal);
	PessoaBuilder setApelido(String apelido);
	PessoaBuilder setNomePai(String nomePai);
	PessoaBuilder setNomeMae(String nomeMae);
	PessoaBuilder setIdade(Integer idade);
	PessoaBuilder setEstado(String estado);
	PessoaBuilder setCidade(String cidade);
	PessoaBuilder setProfissao(String profissao);
	PessoaBuilder setEmpresa(String empresa);
	PessoaBuilder setCargo(String cargo);		
}
