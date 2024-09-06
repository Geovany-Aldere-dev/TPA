import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner;
        int n, a, b, proximoTermo, contador;

        scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número de termos inválido. Digite um número maior que 0.");
        } else if (n == 1) {
            System.out.println("Série de Fibonacci até o 1º termo: 1");
        } else {

            a = 1;
            b = 1;

            System.out.print("Série de Fibonacci: " + a + ", " + b);

            contador = 3;

            while (contador <= n) {
                proximoTermo = a + b;
                System.out.print(", " + proximoTermo);
                
                a = b;
                b = proximoTermo;

                contador++;
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
