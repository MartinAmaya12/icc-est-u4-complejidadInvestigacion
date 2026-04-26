package complejidades;

/*
 * Complejidad Lineal - O(n)
 * El número de operaciones crece de forma proporcional a n.
 * Si n = 10, se ejecuta 10 veces. Si n = 1000, se ejecuta
 * 1000 veces. Un solo ciclo que recorre todos los elementos.
 */

public class ComplejidadLineal {
    public void ejemplo() {
        System.out.println("------Complejidad Lineal------");


        //Se repite n veces 
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
