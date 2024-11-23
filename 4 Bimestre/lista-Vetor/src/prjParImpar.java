import java.util.Scanner;

public class prjParImpar {
    public static void main(String[] args) {
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int posPares = 0;
        int posImpares = TAM - 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite " + TAM + " números inteiros:");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[posPares] = A[i];
                posPares++;
            } else {
                B[posImpares] = A[i];
                posImpares--;
            }
        }

        System.out.println("Vetor B com pares no início e ímpares no final:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }

        in.close();
    }
}
