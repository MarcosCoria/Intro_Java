/* Ejercicio_04: Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5). */
package java_004;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_004 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados Celsius: ");
        float grados= leer.nextFloat();
        float farenheit= 32+ (9* grados/5);
        System.out.println(grados+ " grados Celsius equivalen a " + farenheit + " grados Farenheit.");
    }
}
