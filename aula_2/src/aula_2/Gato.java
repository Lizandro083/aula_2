package aula_2;

public class Gato {
    public String nome;
    public String raca;
    public int idade;
    public String cor;
    
    public void latir () {
      System.out.println("O Gato: " + nome + "miou");
    }
    public void getGato() {
    	System.out.println(
    			"Nome: " + nome +
    			 "\nraca: " + raca +
    			 "\nidade: " + idade +
    			 "\nCor; " + cor
    			 );
    	
    }
} 