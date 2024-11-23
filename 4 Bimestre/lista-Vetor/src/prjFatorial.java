import java.util.Scanner;

public class prjFatorial {
    public static void main(String[] args) {
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int i, j, fatorial;
        Scanner in = new Scanner(System.in);

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o vetor A:");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            fatorial = 1;
            for (j = 1; j <= A[i]; j++) {
                fatorial *= j;
            }
            B[i] = fatorial;
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("Fatorial de " + A[i] + " é: " + B[i]);
        }

        in.close();
    }
}
