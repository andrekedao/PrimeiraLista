package br.com.reges.primeiralista;

/** Classe que modela uma conta bancaria contendo nome do cliente, numero da conta e o saldo
 * 
 * @author Andre Candioto
 *
 */

public class ContaBancaria {
	
/** Nome do Cliente
 * 
 */
	
	String nomeDoCliente;

/** Numero da Conta Bancaria
 * 
 */

	int contaBancaria;
	
/** Saldo na Conta
 * 
 */
	
	double saldo;
	
/**
 * Construtor padrão
 */
	public ContaBancaria() {

	}

/**
 * Construtor recebendo os campos
 * 
 * @param Nome do Cliente
 * @param Conta Bancária
 * @param Saldo
 */
		
	
	public static void main(String[]arg){
		
		ContaBancaria MinhaConta = new ContaBancaria();
		MinhaConta.nomeDoCliente = "Paulo Cunha Genuino";
		MinhaConta.contaBancaria = 251258;
		MinhaConta.saldo = -582.19;
				
	}
		
}
