import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, id, idN, idV, AA, AN;
		
		idV = 0;
		idN= 0;
		
		System.out.println("Digite o Ano Atual");
		AA = in.nextInt();
		
		for ( i=0; i<=10; i++) {
			System.out.println("Digite o Ano de Nascimento");
			AN = in.nextInt();
			
			id = AA-AN;
			
			if ( id > idV) {
				idV = id;
			} else if (id < idV ) {
				idN = id;
			}
			
		}
		
		System.out.println(" Mais velho:" + idV);
		System.out.println("Mais novo:" + idN);
		
		in.close();
		
	}
	
}
