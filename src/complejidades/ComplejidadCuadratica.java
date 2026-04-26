package complejidades;

/*
 * Complejidad Cuadrática - O(n²)
 * Al tener dos ciclos anidados que recorren n completo,
 * las operaciones crecen de forma cuadrática. Es la más costosa.
 */

public class ComplejidadCuadratica {
    public void ejemplo() {
        System.out.println("------Complejidad Cuadratica------");

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
