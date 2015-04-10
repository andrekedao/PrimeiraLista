package br.com.reges.primeiralista;

/** Classe que modela Registro de Agenda contendo dados pessoais
 * 
 * @author Andre Candioto
 *
 */

public class RegistroAgenda {
	
/** Nome da Pessoa
 * 
 */
		
		String nomeDaPessoa;
		
/** Endere�o da Pessoa
 * 
 */
			
		String enderecoDaPessoa;

/** N�mero do Telefone da Pessoa
 * 
 */
			
		int numeroDeTelefone;

/** Endere�o Eletr�nico da Pessoa
 * 
 */
			
		String email;
		
		/**
		 * Construtor padr�o
		 */
		public RegistroAgenda() {

		}

		/**
		 * Construtor recebendo os campos
		 * 
		 * @param Nome da Pessoa
		 * @param Endere�o
		 * @param Numero de Telefone
		 * @param email
		 */
		
		public static void main(String[]arg){
			
			RegistroAgenda MinhaAgenda = new RegistroAgenda();
			MinhaAgenda.nomeDaPessoa = "Paulo Cunha Genuino";
			MinhaAgenda.enderecoDaPessoa = "Avenida Meira Junior, 85";
			MinhaAgenda.numeroDeTelefone = 996040855;
			MinhaAgenda.email = "pcg@gmail.com";
			
			System.out.println(MinhaAgenda.nomeDaPessoa);
			System.out.println(MinhaAgenda.enderecoDaPessoa);
			System.out.println(MinhaAgenda.numeroDeTelefone);
			System.out.println(MinhaAgenda.email);
			
					
		}

}
