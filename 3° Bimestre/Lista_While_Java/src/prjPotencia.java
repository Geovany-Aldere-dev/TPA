import java.util.Scanner;

public class prjPotencia {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a base (um número inteiro): ");
	        int base = scanner.nextInt();

	        System.out.print("Digite o expoente (um número inteiro): ");
	        int expoente = scanner.nextInt();

	        int resultado = 1;

	        int contador = expoente;

	        while (contador > 0) {
	            resultado *= base;
	            
	            contador--; 
	        }
	        
	        System.out.println("O resultado de " + base + " elevado a " + expoente + " é " + resultado);
	  
	        scanner.close();
	    }
}
	       
