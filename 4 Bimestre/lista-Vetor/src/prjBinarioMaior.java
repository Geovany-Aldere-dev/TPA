import java.util.Scanner;

public class prjBinarioMaior {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner in = new Scanner(System.in);
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];

        System.out.println("Digite 10 números para A:");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        System.out.println("Digite 10 números para B:");
        for (int i = 0; i < TAM; i++) {
            B[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (A[i] > B[i]) {
                C[i] = 1; 
            } else if (A[i] == B[i]) {
                C[i] = 0;  
            } else {
                C[i] = -1; 
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

        System.out.println("\nC:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
