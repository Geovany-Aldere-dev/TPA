import java.util.Scanner;

public class prjNumeroPrimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = scanner.nextInt();
		
		int i = 2;
		int j = 0;
		
		if ( n <=1 ) {
			System.out.println("O número " + n + " não é primo.");
		} else {
			
			while ( i <= n/2 ) {
				if ( n % i == 0) {
					j++;
					break;
				}
				i++;
			}
			
			if ( j == 0) {
				System.out.println("O número " + n + " é primo.");
			} else {
				System.out.println("O número " + n + " não é primo.");
			}
		}
		
		scanner.close();
	}

}
