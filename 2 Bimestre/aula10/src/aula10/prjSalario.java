package aula10;
import java.util.Scanner;
public class prjSalario {
	public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  double salario;
		  
		System.out.println("Digite o valor do salário: ");
		salario = ler.nextDouble();
		
		if (salario < 1.302 ) {
			System.out.println("Está abaixo do Salário Mínimo");
		} else {
			System.out.println("Está acima do Salário Mínimo");
		}
		
		ler.close();

	}
	
}
