package aula_2;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;
    public String cor;
    
    public void latir () {
      System.out.println("O cachorro: " + nome + "latiu");
    }
    public void getCachorro() {
    	System.out.println(
    			"Nome: " + nome +
    			 "\nraca: " + raca +
    			 "\nidade: " + idade +
    			 "\nCor; " + cor
    			 );
    	
    }
} 

