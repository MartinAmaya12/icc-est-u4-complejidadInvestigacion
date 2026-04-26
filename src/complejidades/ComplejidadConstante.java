package complejidades;

/*
 * Complejidad Constante - O(1)
 * Sin importar cuántos datos haya, este algoritmo siempre
 * ejecuta el mismo número de operaciones.
 */

public class ComplejidadConstante {
     public void ejemplo() {
        System.out.println("------Complejidad Constante------");

        int x = 10;
        int y = 20;
        int res = x + y;
        System.out.println(res);
    }
}
