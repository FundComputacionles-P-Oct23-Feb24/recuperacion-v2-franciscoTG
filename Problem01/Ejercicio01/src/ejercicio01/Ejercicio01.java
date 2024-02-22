/*
 En una pescadería de la ciudad de Loja se necesita llevar un reporte diario de todos los pescadores que llevan sus
productos a vender. El programa debe permitir de forma cíclica ingresar n número de pescadores (hasta que el usuario lo
decida). Por cada pescador se debe pedir datos como: nombre, número de libras de camarón, número de libras de bacalao.
A cada pescador se le debe pagar en relación de las libras tanto de camarón como de bacalao. En la pescadería se paga
$1.1 la libra de camarón y $1.20 la libra de bacalao. El valor a pagar a cada pescador es igual a la suma de los valores que
corresponden al camarón y bacalao.
Atención al reporte que se debe generar.
Pescadería de la Ciudad
Pescador: Pepe Suarez
Libras de camarón: 10 - costo $11
Libras de bacalao: 8 - costo $9.6
Total a pagar al pescador: $20.6
Pescador: Xavier Perez Marioni
Libras de camarón: 10 - costo $11
Libras de bacalao: 8 - costo $9.6
Total a pagar al pescador: $20.6
Debe usar adicional del procedimiento principal, un función como minimo.

 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author ft110
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadenaFinal = "";
        String cadenaF = "";
        int salir = 0;
        while (bandera == true) {
            cadenaFinal = ObtenerReporte();
            cadenaF = String.format("%s%s\n\n", cadenaF, cadenaFinal);
            System.out.print("Si desea salir ingrese 1: ");
            salir = entrada.nextInt();
            if (salir == 1) {
                bandera = false;
            }
        }
        System.out.print(cadenaF);
    }

    public static String ObtenerReporte() {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String nombre = "";
        double lbCamaron;
        double lbBacalao;
        double Tcamaron = 0;
        double Tbacalao = 0;
        double resultado = 0;
        System.out.println("Ingrese su Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese las Libras de Camaron: ");
        lbCamaron = entrada.nextDouble();
        System.out.println("Ingrese las Libras de Bacalao: ");
        lbBacalao = entrada.nextDouble();

        Tcamaron = lbCamaron * 1.1;
        Tbacalao = lbBacalao * 1.2;
        resultado = Tbacalao + Tcamaron;

        cadenaFinal = String.format("Pescador:%s\nLibras de camaron: %.2f - costo $%.2f\n"
                + "Libras de bacalao: %.2f - costo $%.2f\nTotal a pagar al pescador: $%.2f",
                nombre, lbCamaron, Tcamaron, lbBacalao, Tbacalao, resultado);

        return cadenaFinal;
    }
}

