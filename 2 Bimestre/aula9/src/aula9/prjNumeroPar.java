package aula9;
import java.util.Scanner;
public class prjNumeroPar {
	 public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  int n, resto;
		  
		System.out.println("Digite o número: ");
		n = ler.nextInt();
		
		resto = n%2;
		
		if (resto > 0) {
			System.out.println("Ímpar");
		} else {
			System.out.println("Par");
		}
		
		ler.close();
	
	}
	}

