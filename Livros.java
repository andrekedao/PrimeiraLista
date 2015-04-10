package br.com.reges.primeiralista;


/** Classe que modela os livros de uma biblioteca que possuem: c�digo, nome, 
 * autores, editora, ano da publica��o, c�digo de barras, se��o, prateleira e quantidade.
 * 
 * @author Andre Candioto
 *
 */

public class Livros {
	
	/**
	 * C�digo do Livro
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
	 * Ano da Publica��o do Livro
	 */
	String AnoPublicacao = "";

	/**
	 * C�digo de Barras do Livro
	 */
	Integer codigoDeBarras;
	
	/**
	 * Se��o do Livro
	 */
	String secao = "";

	/**
	 * Prateleira do Livro
	 */
	String prateleira = "";
	
	/** 
	 * Quantidade de Livros Dispon�veis
	 */
	Integer quantidade;
	
	/**
	 * Construtor padr�o
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
	 * @param ano publica��o
	 * @param se��o
	 * @param prateleira
	 * @param quantidade
	 */
	
	public static void main(String[]arg){
		
		Livros meuLivro = new Livros();
		meuLivro.codigo = "123456789";
		System.out.println("C�digo: " + meuLivro.codigo);
		
		meuLivro.nome = "Nome da Rosa";
		System.out.println("Nome: " + meuLivro.nome);
		
		meuLivro.autor = "Peter Pan";
		System.out.println("Autor: " + meuLivro.autor);
		
		meuLivro.editora = "Abril";
		System.out.println("Editora: " + meuLivro.editora);
							
		meuLivro.AnoPublicacao = "2010";
		System.out.println("Ano de Publica��o: " + meuLivro.AnoPublicacao);
		
		meuLivro.secao = "D372j";
		System.out.println("Se��o: " + meuLivro.secao);
		
		meuLivro.prateleira = "A0022";
		System.out.println("Prateleira: " + meuLivro.prateleira);
		
		meuLivro.quantidade = 5;
		System.out.println("Quantidade: " + meuLivro.quantidade);
						
	}

}
