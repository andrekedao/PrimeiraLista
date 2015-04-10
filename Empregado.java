package br.com.reges.primeiralista;


/** Classe que modela Empregado e que contem n�mero de matricula, nome, 
 * fun��o, sal�rio e data de admiss�o
 * 
 * 
 * @author Andre Candioto
 *
 */

public class Empregado {
	
	/**
	 * N�mero da Matr�cula do Empregado
	 */
	static String matricula = "";
	
	/**
	 * Nome do Empregado
	 */
	static String nome = "";
	
	/**
	 * Fun��o do Empregado
	 */
	static String funcao = "";
	
	/**
	 * Sal�rio do Empregado
	 */
	static double salario;
	
	/**
	 * Construtor padr�o
	 */
	public Empregado() {

	}

	/**
	 * Construtor recebendo os campos
	 * 
	 * @param matricula
	 * @param nome
	 * @param fun��o
	 * @param sal�rio
	 * @param admiss�o
	 */
			  
	 public static void main(String[]arg){
			
			Empregado func = new Empregado();
			func.matricula = "001";
			System.out.println("C�digo: " + matricula);
			
			func.nome = "Rosemary Soares";
			System.out.println("Nome: " + nome);
			
			func.funcao = "Contador(a)";
			System.out.println("Fun��o: " + funcao);
			
			func.salario = 3978.78;
			System.out.println("R$: " + salario);
								
			String s="20/02/2010";
			System.out.println("Admiss�o: " + s);
						
							
		}

	 
}
