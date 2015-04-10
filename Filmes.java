package br.com.reges.primeiralista;

import java.sql.Time;

/** Classe que modela filmes disponiveis em uma locadora contendo 
 * código, nome, sinopse, atores, tempo de duração, distribuidora, 
 * código de barras, classificação, gênero, ano de lançamento e quantidade.
 * 
 * @author Andre Candioto
 *
 */

public class Filmes {
	
	/**
	 * Código do Filme
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
	 * Tempo de Duração do Filme
	 */
	Time duracao;
	
	/**
	 * Distribuidora do Filme
	 */
	String distribuidora = "";
	
	/**
	 * Código de Barras do Filme
	 */
	Integer codigoDeBarras;
	
	/**
	 * Classificação do Filmes
	 */
	String classificacao = "";
	
	/**
	 * Gênero do Filme
	 */
	String genero = "";
	
	/**
	 * Ano de Lançamento do Filme
	 */
	String anoDeLancamento = "";
	
	/**
	 * Quantidade de Filmes Disponíveis
	 */
	Integer quantidade;
	
	/**
	 * Construtor padrão
	 */
	public Filmes() {

	}

	/**
	 * Construtor recebendo os campos
	 * 
	 * @param codigo
	 * @param nome
	 * @param genero
	 * @param classificação
	 */
	
	public static void main(String[]arg){
		
		Filmes meuFilme = new Filmes();
		meuFilme.codigo = "001";
		System.out.println(meuFilme.codigo);
		
		meuFilme.nome = "Meu Pé Laranja Pera";
		System.out.println(meuFilme.nome);
		
		meuFilme.genero = "Drama";
		System.out.println(meuFilme.genero);
		
		meuFilme.classificacao = "12 anos";
		System.out.println(meuFilme.classificacao);
		
						
	}
	
	

}
