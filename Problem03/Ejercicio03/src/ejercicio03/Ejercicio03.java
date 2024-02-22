/*
 Datos los siguiente arreglos:
meses <-- {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
"Diciembre"}
ventaNumeroTelevisores <-- {100, 130, 150, 200, 100, 190, 200, 200, 300, 100, 400, 1000}
ventaNumeroCelulares <-- {20, 30, 22, 50, 100, 35, 90, 80, 10, 40, 50, 60}
Generar una solución que permita presentar el siguiente reporte:
El reporte de meses es:
Enero: televisores 100 - celulares 20
Febrero: televisores 130 - celulares 30
Marzo: televisores 150 - celulares 22
Junio: televisores 190 - celulares 35
Septiembre: televisores 300 - celulares 10
 */
package ejercicio03;

/**
 *
 * @author ft110
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaIn = "";
        String cadenaF = "";

        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        int ventaNumeroTelevisores[] = {100, 130, 150, 200, 100, 190, 200, 200,
            300, 100, 400, 1000};
        int ventaNumeroCelulares[] = {20, 30, 22, 50, 100, 35, 90, 80, 10, 40,
            50, 60};
        for (int i = 0; i < 10; i++) {
            cadenaIn = obtenerReporte(meses[i], ventaNumeroTelevisores[i],
                    ventaNumeroCelulares[i]);
            cadenaF = String.format("%s%s\n\n", cadenaF, cadenaIn);
        }
        System.out.println(cadenaF);
    }

    public static String obtenerReporte(String m, int vN, int vC) {
        String cadenaFinal = "";
        if (vC <= 35) {
            cadenaFinal = String.format("%s: televisores %d - celulares %d", m, vN, vC);
        } else {
            cadenaFinal = "!!No valido!!";
        }
        return cadenaFinal;
    }

}
    
