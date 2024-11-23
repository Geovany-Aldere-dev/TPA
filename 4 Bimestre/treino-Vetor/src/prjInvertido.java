import java.util.Scanner;

public class prjInvertido {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            B[i] = A[TAM - 1 - i];
        }

        System.out.print("B = [");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.print("]\n");

        scanner.close();
    }
}
