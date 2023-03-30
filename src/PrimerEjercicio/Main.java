package PrimerEjercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo del que desea realizar los calculos");
        int number = teclado.nextInt();
        System.out.println("El resultado de " + number + " factorial es: " + Maths.factorialDeN(number));
        System.out.println("El la media de los números es: " + Maths.mediaHastaN(number));
        System.out.println("Los pasos de Fibonacci para ese número son: " + Maths.obtenerPasosFibonacci(number));


    }
}
