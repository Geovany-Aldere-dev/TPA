package aula10;
import java.util.Scanner;
public class prjNumero {
	 public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  int n;
		  
		  System.out.println("Digite o número: ");
			n = ler.nextInt();
		  
		if (n < 0) {
			System.out.println("Negativo");
		} else if (n == 0 ){
			System.out.println("Neutro");
		} else 
			System.out.println("Positivo");
	 	}
		

	
}
