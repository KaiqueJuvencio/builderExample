package com.kaiquedev.builders.directors;

import com.kaiquedev.builders.PessoaBuilder;
import com.kaiquedev.models.Pessoa;

public class PessoaDirectorBuilder{
	public Pessoa criaKaique() {
		PessoaBuilder pessoaBuilder = new PessoaBuilder();
		Pessoa pessoaKaique = 
				pessoaBuilder.setNome("Kaique")
					  .setNomeMeio("Juvencio")
					  .setNomeFinal("Costa")
					  .setApelido("Kiko")
					  .setNomePai("José")
					  .setNomeMae("Maria")
					  .setIdade(22)
					  .setEstado("SP")
					  .setCidade("São Paulo")
					  .setProfissao("Desenvolvedor de Software")
					  .setEmpresa("Della Volpe Transportes")
					  .setCargo("Pleno")
					  .criaPessoa();		
		return pessoaKaique;		
	}
	
	public Pessoa criaGiovanna() {
		PessoaBuilder pessoaBuilder = new PessoaBuilder();
		Pessoa pessoaGiovanna = 
				pessoaBuilder.setNome("Giovanna")
					  .setNomeMeio("Nogueira")
					  .setNomeFinal("Novas")
					  .setApelido("Gi")
					  .setNomePai("Antônio")
					  .setNomeMae("Anselma")
					  .setIdade(21)
					  .setEstado("SP")
					  .setCidade("São Paulo")
					  .setProfissao("Recepcionista Premium")
					  .setEmpresa("DASA")
					  .setCargo("Master")
					  .criaPessoa();		
		return pessoaGiovanna;		
	}
}
