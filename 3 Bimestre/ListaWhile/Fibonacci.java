import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de Termos da Série : ");
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println("Número inválido");
		} else if (n == 1) {
			System.out.println("Sequência de Fibonacci até o 1° termo: 1");
		} else {
			
			int a = 1, b = 1;
			System.out.println("Sequência de Fibonacci até o " + n + "° termo: ");
			System.out.println(a + ", " + b);
			
			int i = 3;
			while (i <= n) {
				int proximoT = a + b;
				System.out.println(", " + proximoT);
				a = b;
				b = proximoT;
				i++;
			}
		}
		
		scanner.close();
	}
	
}
