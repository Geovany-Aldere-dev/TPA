package aula9;
import java.util.Scanner;

public class prjSalario {
	public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  double salario, dividas, total;
		  
		System.out.println("Digite o valor do salário: ");
		salario = ler.nextDouble();
		
		System.out.println("Digite o valor das dívidas: ");
		dividas = ler.nextDouble();
		
		total = salario - dividas;
		
		if (total > 0) {
			System.out.println("Sobrará");
		} else {
			System.out.println("Faltará");
		}
		
		System.out.println(total);
		
		ler.close();

	}
}
