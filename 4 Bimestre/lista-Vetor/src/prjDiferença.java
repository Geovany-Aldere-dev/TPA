import java.util.Scanner;

public class prjDiferença {
    public static void main(String[] args) {
        final int TAM = 5;
        Scanner in = new Scanner(System.in);
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        int c = 0;

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        System.out.println("Digite 10 números para o vetor B:");
        for (int i = 0; i < TAM; i++) {
            B[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            int existeNoB = 0;
            for (int j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    existeNoB = 1;
                    break;
                }
            }
            if (existeNoB == 0) {
                C[c] = A[i];
                c++;
            }
        }

        System.out.println("Elementos de A que não estão em B:");
        for (int i = 0; i < c; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
