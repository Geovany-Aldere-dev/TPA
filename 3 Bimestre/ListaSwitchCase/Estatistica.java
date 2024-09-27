import java.util.Scanner;
public class Estatistica {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int A, MB, B, R, I;
		String name; Object M;
		double PMB, PB, PR, PI;
		
		System.out.println("Digite a quantidade de MB's do Aluno");
		MB = in.nextInt();
		
		System.out.println("Digite a quantidade de B's do Aluno");
		B = in.nextInt();
		
		System.out.println("Digite a quantidade de R's do Aluno");
		R = in.nextInt();
		
		System.out.println("Digite a quantidade de I's do Aluno");
		I = in.nextInt();
		
		A = MB+B+R+I;
		
		System.out.println("Digite a a Menção que será consultada entre MB, B, R ou I");
		M = in.next();
		
		switch(M) {
			case MB:
				PMB = A*100/MB;
				System.out.println(PMB);
				break;
			case B:
				PB = A*100/B;
				System.out.println(PB);
				break;
			case R: 
				PR = A*100/R;
				System.out.println(PR);
			case I:
				PI = A*100/I;
				System.out.println(PI);
				break;
			default:
                System.out.println("Menção Inválida");
		}
		in.close();
	}
}
