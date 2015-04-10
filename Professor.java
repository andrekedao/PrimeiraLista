package br.com.reges.primeiralista;

/** Classe que modela o professor da Faculdade de Informática Ideal
 * 
 * @author Andre Candioto
 *
 */
  
public class Professor 
{  
	/**
	 * Nome do Professor
	 */
    private String nome;
    /**
     * Matricula do Professor
     */
    private int matricula;
    /**
     * Carga Horaria do Professor
     */
    private static int cargaHoraria;
    /**
     * Salario fixo do Professor
     */
    protected double salario;
    
       
public Professor(String nome, int matricula, int cargaHoraria, double salario){  
    super ();
	this.nome=nome;
    this.matricula=matricula;
    this.salario=salario;
        
} 

/**
 * Construtor padrão
 */
	
public Professor() {
	// TODO Auto-generated constructor stub
}
/**
 * Construtor recebendo os campos
 * 
 * @param Nome do Professor
 * @param Matricula
 * @param Carga Horaria
 * @param Salario
 */

public static void main(String[]arg){
	
	Professor theacher = new Professor();
	theacher.nome = "Rogerio Barbosa";
	System.out.println("Nome: " + theacher.nome);
	
	theacher.matricula = 5050;
	System.out.println("Matricula: " + theacher.matricula);
	
	theacher.setCargaHoraria(200);
	System.out.println("Carga Horaria: " + theacher.getCargaHoraria());
	
	theacher.salario = 5000.00;
	System.out.println("Salario: " + theacher.salario);
	
}

public static int getCargaHoraria() {
	return cargaHoraria;
}

public static void setCargaHoraria(int cargaHoraria) {
	Professor.cargaHoraria = cargaHoraria;
}
}

	
 



	

    
