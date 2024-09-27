
public class prjAltura {
	public static void main(String[] args) {
	    int i = 0;
	    double AJ = 1.34;
	    double AP = 1.45;
	    double CJ = 0.025;
	    double CP = 0.02;

	    while (AJ <= AP) {
	      AJ += CJ; 
	      AP += CP;
	      i++;
	    }
	    System.out.println(" João levará " + i + " anos para ficar mais alto que Pedro.");
	  }
	
}
