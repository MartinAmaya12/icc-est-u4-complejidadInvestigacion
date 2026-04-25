package complejidades;

public class ComplejidadLogaritmica {
    public void ejemplo() {
        System.out.println("------Complejidad Logaritmica------");

        int n = 10;
        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }
}
