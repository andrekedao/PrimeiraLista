package br.com.reges.primeiralista;

/** Classe que modela Passageiros que contem código, nome, RG, CPF, telefone, 
 * data de nascimento, país origem, estado origem, cidade origem, país destino, 
 * estado destino, cidade destino, número do vôo, acento, necessidades especiais.
 * 
 * @author Andre Candioto
 *
 */

public class Passageiros {
	
	/**
	 * Código do Passageiro
	 */
	String codigo = "";
	
	/**
	 * Nome do Passageiro
	 */
	String nome = "";
	
	/**
	 * Identidade do Passageiro
	 */
	Integer rg;
	
	/**
	 * CPF do Passageiro
	 */
	String cpf;
	
	/**
	 * Telefone do Passageiro
	 */
	Integer telefone;
	
	/**
	 * Data de Nascimento do Passageiro
	 */
	String nascimento;
	
	/**
	 * Pais origem do Passageiro
	 */
	String paisOrigem;
	
	/**
	 * Estado origem do Passageiro
	 */
	String estadoOrigem;
	
	/**
	 * Cidade origem do Passageiro
	 */
	String cidadeOrigem;
	
	/**
	 * Pais destino do Passageiro
	 */
	String paisDestino;
	
	/**
	 * Estado destino do Passageiro
	 */
	String estadoDestino;
	
	/**
	 * Cidade destino do Passageiro
	 */
	String cidadeDestino;
	
	/**
	 * Número do Vôo do Passageiro
	 */
	Integer numeroDoVoo;
	
	/**
	 * Acento do Passageiro
	 */
	String acento;
	
	/**
	 * Necessidades Especiais do Passageiro
	 */
	String necessidadesEspeciais;
	
	/**
	 * Construtor padrão
	 */
	public Passageiros() {

	}
	
	/**
	 * Construtor recebendo os campos
	 * 
	 * @param codigo
	 * @param nome
	 * @param rg
	 * @param cpf
	 * @param pais origem
	 * @param estado origem
	 * @param cidade origem
	 * @param pais destino
	 * @param estado destino
	 * @param cidade destino
	 * @param numero do voo
	 * @param acento
	 * @param necessidades especiais
	 */

	
public static void main(String[]arg){
		
		Passageiros passageiro = new Passageiros();
		passageiro.codigo = "12345";
		System.out.println("Código: " + passageiro.codigo);
		
		passageiro.nome = "Messi Neymar";
		System.out.println("Nome: " + passageiro.nome);
		
		passageiro.rg = 22440407;
		System.out.println("RG: " + passageiro.rg);
		
		passageiro.cpf = "25108276850";
		System.out.println("CPF: " + passageiro.cpf);
							
		passageiro.paisOrigem = "Brasil";
		System.out.println("Pais de Origem: " + passageiro.paisOrigem);
		
		passageiro.estadoOrigem = "Rio de Janeiro";
		System.out.println("Estado de Origem: " + passageiro.estadoOrigem);
		
		passageiro.cidadeOrigem = "Petrópolis";
		System.out.println("Cidade de Origem: " + passageiro.cidadeOrigem);
		
		passageiro.paisDestino = "Estados Unidos";
		System.out.println("Pais de Destino: " + passageiro.paisDestino);
		
		passageiro.estadoDestino = "Texas";
		System.out.println("Estado de Destino: " + passageiro.estadoDestino);
		
		passageiro.cidadeDestino = "Novo Texas";
		System.out.println("Cidade de Destino: " + passageiro.cidadeDestino);
		
		passageiro.numeroDoVoo = 4564;
		System.out.println("Vôo: " + passageiro.numeroDoVoo);
		
		passageiro.acento = "A58";
		System.out.println("Acento: " + passageiro.acento);
		
		passageiro.necessidadesEspeciais = "Remédio Controlado";
		System.out.println("Necessidades Especiais: " + passageiro.necessidadesEspeciais);
		
	}

}
