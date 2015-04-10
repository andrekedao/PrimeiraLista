package br.com.reges.primeiralista;


/** Classe que modela os livros de uma biblioteca que possuem: código, nome, 
 * autores, editora, ano da publicação, código de barras, seção, prateleira e quantidade.
 * 
 * @author Andre Candioto
 *
 */

public class Livros {
	
	/**
	 * Código do Livro
	 */
	String codigo = "";

	/**
	 * Nome do Livro
	 */
	String nome = "";
	
	/**
	 * Autor(es) do Livro
	 */
	String autor = "";

	/**
	 * Editora do Livro
	 */
	String editora = "";
	
	/**
	 * Ano da Publicação do Livro
	 */
	String AnoPublicacao = "";

	/**
	 * Código de Barras do Livro
	 */
	Integer codigoDeBarras;
	
	/**
	 * Seção do Livro
	 */
	String secao = "";

	/**
	 * Prateleira do Livro
	 */
	String prateleira = "";
	
	/** 
	 * Quantidade de Livros Disponíveis
	 */
	Integer quantidade;
	
	/**
	 * Construtor padrão
	 */
	public Livros() {

	}
	
	/**
	 * Construtor recebendo os campos
	 * 
	 * @param codigo
	 * @param nome
	 * @param autor
	 * @param editora
	 * @param ano publicação
	 * @param seção
	 * @param prateleira
	 * @param quantidade
	 */
	
	public static void main(String[]arg){
		
		Livros meuLivro = new Livros();
		meuLivro.codigo = "123456789";
		System.out.println("Código: " + meuLivro.codigo);
		
		meuLivro.nome = "Nome da Rosa";
		System.out.println("Nome: " + meuLivro.nome);
		
		meuLivro.autor = "Peter Pan";
		System.out.println("Autor: " + meuLivro.autor);
		
		meuLivro.editora = "Abril";
		System.out.println("Editora: " + meuLivro.editora);
							
		meuLivro.AnoPublicacao = "2010";
		System.out.println("Ano de Publicação: " + meuLivro.AnoPublicacao);
		
		meuLivro.secao = "D372j";
		System.out.println("Seção: " + meuLivro.secao);
		
		meuLivro.prateleira = "A0022";
		System.out.println("Prateleira: " + meuLivro.prateleira);
		
		meuLivro.quantidade = 5;
		System.out.println("Quantidade: " + meuLivro.quantidade);
						
	}

}
