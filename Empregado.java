package br.com.reges.primeiralista;


/** Classe que modela Empregado e que contem número de matricula, nome, 
 * função, salário e data de admissão
 * 
 * 
 * @author Andre Candioto
 *
 */

public class Empregado {
	
	/**
	 * Número da Matrícula do Empregado
	 */
	static String matricula = "";
	
	/**
	 * Nome do Empregado
	 */
	static String nome = "";
	
	/**
	 * Função do Empregado
	 */
	static String funcao = "";
	
	/**
	 * Salário do Empregado
	 */
	static double salario;
	
	/**
	 * Construtor padrão
	 */
	public Empregado() {

	}

	/**
	 * Construtor recebendo os campos
	 * 
	 * @param matricula
	 * @param nome
	 * @param função
	 * @param salário
	 * @param admissão
	 */
			  
	 public static void main(String[]arg){
			
			Empregado func = new Empregado();
			func.matricula = "001";
			System.out.println("Código: " + matricula);
			
			func.nome = "Rosemary Soares";
			System.out.println("Nome: " + nome);
			
			func.funcao = "Contador(a)";
			System.out.println("Função: " + funcao);
			
			func.salario = 3978.78;
			System.out.println("R$: " + salario);
								
			String s="20/02/2010";
			System.out.println("Admissão: " + s);
						
							
		}

	 
}
