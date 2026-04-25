package complejidades;

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
