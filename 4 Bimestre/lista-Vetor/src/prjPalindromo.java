import java.util.Scanner;

public class prjPalindromo {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner in = new Scanner(System.in);
        int[] A = new int[TAM];
        int i;

        System.out.println("Digite 10 números para descobrir o Palíndromo:");
        for (i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM / 2; i++) {
            if (A[i] != A[TAM - 1 - i]) {
                System.out.println(" Não é um palíndromo.");
                return;
            }
        }

        System.out.println(" É um palíndromo.");
    }
}
