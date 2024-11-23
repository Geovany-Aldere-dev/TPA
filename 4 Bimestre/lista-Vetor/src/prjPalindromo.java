import java.util.Scanner;

public class prjPalindromo {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner in = new Scanner(System.in);
        int[] A = new int[TAM];
        int i;

        System.out.println("Digite 10 n�meros para descobrir o Pal�ndromo:");
        for (i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM / 2; i++) {
            if (A[i] != A[TAM - 1 - i]) {
                System.out.println(" N�o � um pal�ndromo.");
                return;
            }
        }

        System.out.println(" � um pal�ndromo.");
    }
}
