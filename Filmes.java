package br.com.reges.primeiralista;

import java.sql.Time;

/** Classe que modela filmes disponiveis em uma locadora contendo 
 * c�digo, nome, sinopse, atores, tempo de dura��o, distribuidora, 
 * c�digo de barras, classifica��o, g�nero, ano de lan�amento e quantidade.
 * 
 * @author Andre Candioto
 *
 */

public class Filmes {
	
	/**
	 * C�digo do Filme
	 */
	String codigo;

	/**
	 * Nome do Filme
	 */
	String nome = "";
	
	/**
	 * Sinopse do Filme
	 */
	String sinopse = "";
	
	/**
	 * Atores do Filme
	 */
	String atores = "";
	
	/**
	 * Tempo de Dura��o do Filme
	 */
	Time duracao;
	
	/**
	 * Distribuidora do Filme
	 */
	String distribuidora = "";
	
	/**
	 * C�digo de Barras do Filme
	 */
	Integer codigoDeBarras;
	
	/**
	 * Classifica��o do Filmes
	 */
	String classificacao = "";
	
	/**
	 * G�nero do Filme
	 */
	String genero = "";
	
	/**
	 * Ano de Lan�amento do Filme
	 */
	String anoDeLancamento = "";
	
	/**
	 * Quantidade de Filmes Dispon�veis
	 */
	Integer quantidade;
	
	/**
	 * Construtor padr�o
	 */
	public Filmes() {

	}

	/**
	 * Construtor recebendo os campos
	 * 
	 * @param codigo
	 * @param nome
	 * @param genero
	 * @param classifica��o
	 */
	
	public static void main(String[]arg){
		
		Filmes meuFilme = new Filmes();
		meuFilme.codigo = "001";
		System.out.println(meuFilme.codigo);
		
		meuFilme.nome = "Meu P� Laranja Pera";
		System.out.println(meuFilme.nome);
		
		meuFilme.genero = "Drama";
		System.out.println(meuFilme.genero);
		
		meuFilme.classificacao = "12 anos";
		System.out.println(meuFilme.classificacao);
		
						
	}
	
	

}
