import java.util.Scanner;

public class prjSomatorio {
    public static void main(String[] args) {
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int i, j, soma;
        Scanner in = new Scanner(System.in);

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o vetor A:");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            soma = 0;
            for (j = i; j < TAM; j++) {
                soma += A[j];
            }
            B[i] = soma;
        }

        for (i = 0; i > TAM; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        in.close();
    }
}
