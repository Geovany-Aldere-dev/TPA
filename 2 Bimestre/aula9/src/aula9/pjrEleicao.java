package aula9;
import java.util.Scanner;
public class pjrEleicao {
  public static void main(String[] args) {
	  Scanner ler = new Scanner (System.in);
	  int ae, an, id;
	  
	System.out.println("Digite o ano da eleição ");
	ae = ler.nextInt();
	
	System.out.println("Digite o ano de nascimento ");
	an = ler.nextInt();
	
	id = ae - an;
	
	System.out.println( id + " anos.");
	
	if (id > 16) {
		System.out.println("Poderá votar");
	} else {
		System.out.println("Não poderá votar");
	}
	
	ler.close();

	
	
}
}
