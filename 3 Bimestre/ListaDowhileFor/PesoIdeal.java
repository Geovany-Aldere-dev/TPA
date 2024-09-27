import java.util.*;
public class PesoIdeal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double h, pi;
		int i=0;
		String respostaS;
		
		
		do {
			System.out.println("Digite o sexo do usuário, 'F' para Feminino e 'M' para Masculino.");
			respostaS = in.next();
			
			
			if (respostaS.equalsIgnoreCase("F")) {
			
				System.out.println("Digite a altura da usuária.");
				h = in.nextInt();
				pi = 52 + (0.67 * (h - 152.4));
				
				System.out.println("O Peso Ideal da usuária seria de:" + pi + "Kg." );
				
			} else if (respostaS.equalsIgnoreCase("M")){
				System.out.println("Digite a altura do usuário.");
				h = in.nextInt();
				pi = 52 + (0.75 * (h - 152.4));
				
				System.out.println("O Peso Ideal do usuário seria de:" + pi + "Kg." );
				
			} else {
				System.out.println("Opção inválida");
			}
			
			System.out.println("Deseja continuar a execução? (1- para Sim) (2- para Não)");
			i = in.nextInt();
			
		} while (i == 1);
		
		System.out.println("Adeus! :D ");
		
		in.close();
	}
}
