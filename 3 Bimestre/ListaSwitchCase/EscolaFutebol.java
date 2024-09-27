import java.util.Scanner
public class EscolaFutebol {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int nasci, anoAtual, id;
		
		System.out.println("Digite o ano atual");
		anoAtual = in.nextInt();
		
		System.out.println("Digite o ano de nascimento");
		nasci = in.nextInt();
		
		id = anoAtual-nasci;
		
		switch(id) {
			case 6:
				System.out.println("dente de leite");
				break;
			case 7:
				System.out.println("júnior");
				break;
			case 8:
				System.out.println("júnior max");
				break;
			case 9:
				System.out.println("júnior master");
				break;
			case 10:
				System.out.println("master");
				break;
			default:
				System.out.println("Idade não aceita");
				
		}
		
		in.close();
	}
}
