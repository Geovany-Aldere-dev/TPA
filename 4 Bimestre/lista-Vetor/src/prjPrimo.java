import java.util.Scanner;

public class prjPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            int divisor = 0;

            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    divisor++;
                }
            }

            if (divisor == 2) {
                System.out.println(A[i] + " é um número primo.");
            } else {
                System.out.println(A[i] + " não é um número primo.");
            }
        }

        in.close();
    }
}
