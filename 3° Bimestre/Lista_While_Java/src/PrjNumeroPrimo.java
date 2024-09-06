import java.util.Scanner;

public class PrjNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner;
        int numero;
        boolean primo;
        int divisor;

        scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            primo = true; 

            divisor = 2;

            while (divisor < numero) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            }

            if (primo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        scanner.close();
    }
}
