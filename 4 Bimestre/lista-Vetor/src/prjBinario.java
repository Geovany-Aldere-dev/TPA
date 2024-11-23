import java.util.Scanner;

public class prjBinario {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner in = new Scanner(System.in);
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        System.out.println("Digite 10 números para A:");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;  
            }
        }

        System.out.println("A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nB:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
