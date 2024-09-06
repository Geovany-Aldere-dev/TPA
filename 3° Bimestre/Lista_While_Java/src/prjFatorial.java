import java.util.Scanner;

public class prjFatorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite um número inteiro: ");
        int n = scanner.nextInt();
        
        
        int f = 1;
        int c = n;

        while ( c > 0) {
            f *= c;
            c--;            
        }

        System.out.println("O fatorial de " + n + " é " + f);
        
        scanner.close();
}
	
}
