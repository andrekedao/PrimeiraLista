package br.com.reges.primeiralista;

/** Classe que modela o Professor Horista da Faculdade de Informática Ideal
 * 
 * @author Andre Candioto
 *
 */

public class ProfessorHorista extends Professor{  
	  
  
  public ProfessorHorista(String nome, int matricula, int cargaHoraria)  
   {  
       super ();
       this.setCargaHoraria(cargaHoraria);       
         
   }
  
  
   public static void main(String[]arg){
		
		Professor theacher = new Professor();	
		theacher.salario = (getCargaHoraria() * 55.50);
		System.out.println("Salario: " + theacher.salario);	
		
   }		
}

   
   
   
   
   
   
   
   
   
   