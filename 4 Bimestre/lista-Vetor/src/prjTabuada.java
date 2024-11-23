import java.util.Scanner;

public class prjTabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int[] A = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para ver sua tabuada:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada de " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
            System.out.println();
        }

        in.close();
    }
}
