package PrimerEjercicio;

import org.w3c.dom.ls.LSOutput;

public class Maths {
    public static int factorialDeN(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total = total * i;
        }
        return total;
    }

    public static float mediaHastaN(float num) {

        int resultado = 0;
        for (int i = 0; i <= num; i++) {
            resultado += i;
        }
        return (float) resultado / num;
    }

    public static String obtenerPasosFibonacci(int num) {
        if (num < 1) {
            return "";
        }
        if (num == 1) {
            return "0";
        }
        int[] fibonacci = new int[num];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < num; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        StringBuilder cadenita = new StringBuilder();
        for (int i = 0; i < num; i++) {
            cadenita.append(fibonacci[i]);
            if (i < num - 1) {
                cadenita.append(", ");
            }
        }
        return cadenita.toString();
    }


}

