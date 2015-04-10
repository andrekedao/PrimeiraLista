package br.com.reges.primeiralista;

	/** Classe que modela uma lampada que liga e desliga
	 * 
	 * @author Andre Candioto
	 *
	 */

public class Lampada {
	
	public String Lampada;
	
	/** metodo para ligar a lampada
	 * 
	 */
		void ligar() {
			System.out.println("Ligar a lampada");
		}
		
	/** metodo para desligar a lampada
	 * 
	 */
		
		void desligar() {
			System.out.println("Desligar a lampada");
		}
		
	/** metodo para testar a lampada
	 * 
	 * @param arg
	 */
		
		public static void main(String[]arg){
			
			Lampada MinhaLampada = new Lampada();
			MinhaLampada.ligar();
			MinhaLampada.desligar();
			
		}

}
