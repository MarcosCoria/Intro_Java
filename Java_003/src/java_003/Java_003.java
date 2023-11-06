/* Ejercicio_03: Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
package java_003;

import java.util.Scanner;

/*@author G96xyFast */
public class Java_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase= leer.nextLine();
        while (frase.equals(" ") || frase.equals("")) {
            System.out.println("Error. Ingrese una frase nuevamente: ");
            frase= leer.nextLine();
        }
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
    }
}
