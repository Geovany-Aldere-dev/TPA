public class prjPotencia {
    public static void main(String[] args) {
        final int TAM = 11;
        int[] A = new int[TAM];
        int i, j;

        for (i = 0; i < TAM; i++) {
            A[i] = 1;
            for (j = 0; j < i; j++) {
                A[i] *= 2;
            }
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = 2 elevado a " + i + " = " + A[i]);
        }
    }
}
