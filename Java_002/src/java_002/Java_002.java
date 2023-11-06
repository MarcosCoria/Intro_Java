/* Ejercicio_02: Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. */
package java_002;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_002 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre= leer.next();
        System.out.println("El nombre ingresado es: " + nombre);
    }   
}
