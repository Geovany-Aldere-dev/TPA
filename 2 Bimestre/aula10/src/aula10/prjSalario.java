package aula10;
import java.util.Scanner;
public class prjSalario {
	public static void main(String[] args) {
		  Scanner ler = new Scanner (System.in);
		  double salario;
		  
		System.out.println("Digite o valor do sal�rio: ");
		salario = ler.nextDouble();
		
		if (salario < 1.302 ) {
			System.out.println("Est� abaixo do Sal�rio M�nimo");
		} else {
			System.out.println("Est� acima do Sal�rio M�nimo");
		}
		
		ler.close();

	}
	
}
