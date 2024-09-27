import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int C;
		
		System.out.println("Digite o código do produto: ");
		C = in.nextInt();
		
		switch(C) {
			case 1:
				System.out.println("Cachorro-Quente");
				System.out.println("Custa R$8,00");
				break;
			case 2:
				System.out.println("Cheeseburguer");
				System.out.println("Custa R$12,00");
				break;
			case 3:
				System.out.println("X-Salada");
				System.out.println("Custa R$15,00");
				break;
			case 4:
				System.out.println("Misto Quente");
				System.out.println("Custa R$11,00");
				break;
			case 5:
				System.out.println("Pão na Chapa");
				System.out.println("Cust R$6,00");
			    break;
			default:
				System.out.println("Código Inválido");
		}
		
	in.close();
		
	}
}
