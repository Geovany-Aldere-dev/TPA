package aula9;
import java.util.Scanner;
public class pjrEleicao {
  public static void main(String[] args) {
	  Scanner ler = new Scanner (System.in);
	  int ae, an, id;
	  
	System.out.println("Digite o ano da elei��o ");
	ae = ler.nextInt();
	
	System.out.println("Digite o ano de nascimento ");
	an = ler.nextInt();
	
	id = ae - an;
	
	System.out.println( id + " anos.");
	
	if (id > 16) {
		System.out.println("Poder� votar");
	} else {
		System.out.println("N�o poder� votar");
	}
	
	ler.close();

	
	
}
}
