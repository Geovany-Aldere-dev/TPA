import java.util.Scanner;

public class prjPotencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[];
		a = new int[TAM];
		b = new int[TAM];
		
		//Vetor A
		for( i=0; i<TAM; i++) { 
			System.out.println("Digite o " +(i+1)+ " valor do Vetor A:");
			a[i] = scanner.nextInt();
			
			//Cálculo
			b[i] = a[i] * a[i];
		} 
		
		//Apresentando o Vetor B
		System.out.print("B = [");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");
		
		
	}
}
