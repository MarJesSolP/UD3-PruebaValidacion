package SegundoEjercicio;

import SegundoEjercicio.Camion;
import SegundoEjercicio.Ciclomotor;

public class Main {
    public static void main(String[] args) {

        Camion camion1 = new Camion("Mercedes", 3.500f, 130, 4, 90, 4);
        Ciclomotor ciclomotor1 = new Ciclomotor("Kymco", 123, 4, 0, 40, false);

        System.out.println(camion1);
        System.out.println("\t - Cuando el camión acelera su velocidad llega a: " + camion1.acelerar(90) + "Km/h");
        System.out.println(ciclomotor1);
        System.out.println("\t - Cuando el ciclomotor acelera su velocidad llega a: " + ciclomotor1.acelerar(40) + "Km/h");


    }
}