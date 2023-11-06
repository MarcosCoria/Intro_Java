/* Ejercicio_01: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma */
package java_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_001 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos: \nNúmero1: ");
        int num1= leer.nextInt();
        while (num1<0) {
            System.out.println("Error. Ingrese de nuevo el Número1: ");
            num1= leer.nextInt();
        }
        System.out.println("Número2: ");
        int num2= leer.nextInt();
        while (num2<0) {
            System.out.println("Error. Ingrese de nuevo el Número2: ");
            num2= leer.nextInt();
        }
        System.out.println("La suma de los dos números ingresados es: " + (num1+num2));
    }
}
