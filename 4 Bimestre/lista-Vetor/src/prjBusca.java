import java.util.Scanner;

public class prjBusca {
    public static void main(String[] args) {
        final int TAM = 4;
        int[] A = new int[TAM];
        int X;
        int i;
        Scanner in = new Scanner(System.in);

        //Leitura do vetor A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "� n�mero para o vetor A:");
            A[i] = in.nextInt();
        }

        //N�mero que o usuario qr achar 
        System.out.println("Digite o n�mero X para buscar no vetor A:");
        X = in.nextInt();

        //An�lise e apresenta��o
        for (i = 0; i < TAM; i++) {
            if (A[i] == X) {
                System.out.println("O n�mero " + X + " foi encontrado no vetor A.");
                break;
            }
            if (i == TAM - 1) {
                System.out.println("O n�mero " + X + " n�o foi encontrado no vetor A.");
            }
        }

        in.close();
    }
}
