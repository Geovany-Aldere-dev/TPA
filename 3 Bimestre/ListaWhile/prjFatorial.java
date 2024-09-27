import java.util.Scanner;

public class prjFatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Digite um número: ");
		int n = scanner.nextInt();
		
		int i = 1;
		int j = n;
		
		while ( j > 1) {
			i *= j;
			j--;
		}
		
		System.out.println("O fatorial de" + n + " é " + i);
		
		scanner.close();
	}

}
