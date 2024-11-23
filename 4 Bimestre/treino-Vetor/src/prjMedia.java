import java.util.Scanner;

public class prjMedia {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[TAM];
        int soma = 0;
        int maior;
        int posicaoMaior = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            A[i] = scanner.nextInt();
            soma += A[i];

            if (i == 0) {
                maior = A[i];
            }

            if (A[i] > A[posicaoMaior]) {
                maior = A[i];
                posicaoMaior = i;
            }
        }

        double media = (double) soma / TAM;

        System.out.println("A média dos valores é: " + media);

        System.out.println("O maior valor é " + A[posicaoMaior] + " e está na posição " + posicaoMaior);

        System.out.print("A = [");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("]\n");

        scanner.close();
    }
}
