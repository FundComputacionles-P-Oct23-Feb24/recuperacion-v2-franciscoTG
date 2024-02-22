/*
Utilizando una estructura repetitiva diseñe solución para calcular la suma e imprima los términos de la serie:
(1*2)/7
(2*4)/14
(3*6)/21
(4*8)/28
(5*10)/35
(6*12)/42
Debe usar adicional del procedimiento principal, un función como minimo.
 */
package ejercicio04;

/**
 *
 * @author ft110
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] mensaje = new String[6];
        int n1 = 1;
        int n2 = 2;
        int n3 = 7;
        mensaje = obtenerDatos(n1, n2, n3);
        pantalla(mensaje);

    }

    public static String[] obtenerDatos(int base, int mult, int div) {
        String[] cadenaFinal = new String[6];
        for (int i = 0; i < 6; i++) {
            cadenaFinal[i] = "(" + base + "*" + mult + ")" + "/" + div;
            base = base + 1;
            mult = mult + 2;
            div = div + 7;
        }
        return cadenaFinal;
    }

    public static void pantalla(String[] mensaje) {
        System.out.print("Presentacion:\n");
        for (int i = 0; i < mensaje.length; i++) {

            System.out.print(mensaje[i] + "\n");
        }
    }
}





