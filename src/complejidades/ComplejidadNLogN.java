package complejidades;

/*
 * Complejidad NLogN - O(n log n)
 * Combina un ciclo logarítmico (i *= 2) con uno lineal (j < n).
 */

public class ComplejidadNLogN {
    public void ejemplo() {
        System.out.println("------Complejidad NLogN------");

        int n = 10;
        for (int i = 1; i < n; i *= 2) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
