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
            System.out.println("Digite o " + (i + 1) + "º número para o vetor A:");
            A[i] = in.nextInt();
        }

        //Número que o usuario qr achar 
        System.out.println("Digite o número X para buscar no vetor A:");
        X = in.nextInt();

        //Análise e apresentação
        for (i = 0; i < TAM; i++) {
            if (A[i] == X) {
                System.out.println("O número " + X + " foi encontrado no vetor A.");
                break;
            }
            if (i == TAM - 1) {
                System.out.println("O número " + X + " não foi encontrado no vetor A.");
            }
        }

        in.close();
    }
}
