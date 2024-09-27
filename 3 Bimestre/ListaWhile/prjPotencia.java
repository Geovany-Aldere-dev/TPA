import java.util.Scanner;

public class prjPotencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int b = scanner.nextInt();
		
		System.out.println("Digite o expoente: ");
		int e = scanner.nextInt();
		
		int resultado = 1;
		
		int contador = e;
		
		while (contador > 0) {
			resultado *= b;
			
			contador--;
		}
		
		System.out.println("O resultado de " + b + " elevado a " + e + " é " + resultado);
		
		scanner.close();
	}

}
