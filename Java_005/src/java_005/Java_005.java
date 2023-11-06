/* Ejercicio_05: Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt(). */
package java_005;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_005 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num= leer.nextInt();
        System.out.println("El doble del número ingresado es: " + (num*2) + "\nEl triple del número ingresado es: " + (num*3) + "\nLa raíz cuadrada del número es: " + (Math.sqrt(num)));
    }
}