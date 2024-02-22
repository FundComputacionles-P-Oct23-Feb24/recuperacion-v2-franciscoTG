/*
 Dadas las siguientes estructuras:
equipos <-- {
 "Barcelona", "Emelec", "Liga de Quito", "Independiente del Valle", "Delfin", "Macará", "Deportivo Cuenca", "Orense",
}
goles <-- {
 {1, 2, 2, 5}, {4, 1, 1, 4}, {8, 0, 1, 3}, {7, 1, 1, 2}, {6, 0, 1, 2}, {5, 2, 1, 1}, {4, 0, 3, 2}, {3, 1, 2, 1}, }
Donde;
Al equipo Barcelona le corresponden los puntos 1,2,2,5
Al equipo Emelec le corresponden los puntos 4,1,1,4
y así sucesivamente
En un método principal recorrer las estructuras; en cada iteración llamar a un procedimiento llamado presentarReporte que
reciba 5 parámetros: una cadena y cuatro enteros.
El procedimiento debe presentar la siguiente información; en cada oportunidad que es llamado
Barcelona con puntos: 1,2,2,5 tiene un total de puntos de 10
 */
package ejercicio02;

/**
 *
 * @author ft110
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String equipos[] = {"Barcelona", "Emelec", "Liga de Quito",
            "Independiente del Valle", "Delfin", "Macara", "Deportivo Cuenca",
            "Orense",};
        int goles[][] = {
            {1, 2, 2, 5}, {4, 1, 1, 4},
            {8, 0, 1, 3}, {7, 1, 1, 2},
            {6, 0, 1, 2}, {5, 2, 1, 1},
            {4, 0, 3, 2}, {3, 1, 2, 1},};

        for (int i = 0; i < equipos.length; i++) {
            presentarReporte(equipos[i], goles[i][0], goles[i][1], goles[i][2],
                    goles[i][3]);
        }

    }

    public static void presentarReporte(String equipos, int g0, int g1,
            int g2, int g3) {
        int suma = g0 + g1 + g2 + g3;
        System.out.printf("%s con puntos:%d,%d,%d,%d tiene un total de puntos "
                + "de %d\n\n",
                equipos,
                g0,
                g1,
                g2,
                g3,
                suma);
    }
}
 

