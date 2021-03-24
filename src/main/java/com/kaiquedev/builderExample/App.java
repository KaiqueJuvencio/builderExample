package com.kaiquedev.builderExample;

import com.kaiquedev.builders.directors.PessoaDirectorBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PessoaDirectorBuilder pessoaBuilder = new PessoaDirectorBuilder();
        System.out.println(pessoaBuilder.criaKaique());
        System.out.println(pessoaBuilder.criaGiovanna());     
    }
}
