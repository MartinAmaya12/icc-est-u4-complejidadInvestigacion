package complejidades;

/*
 * Complejidad Logarítmica - O(log n)
 * En cada iteración, i se multiplica por 2 (i *= 2), lo que
 * hace que el ciclo no recorra todos los valores de n, sino
 * solo log₂(n) veces.
 */

public class ComplejidadLogaritmica {
    public void ejemplo() {
        System.out.println("------Complejidad Logaritmica------");

        int n = 10;
        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }
}
