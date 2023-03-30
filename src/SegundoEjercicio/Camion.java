package SegundoEjercicio;

public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, float peso, int potencia, int numeroDePuertas, int velocidad, int capacidadCarga) {
        super(marca, peso, potencia, numeroDePuertas, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public int acelerar(int velocidad) {
        return velocidad + 5;
    }

    @Override
    public String toString() {
        String msg = "Tipo de vehículo: Ciclomotor ";
        msg += "\n\t - Marca : " + getMarca();
        msg += "\n\t - Peso : " + getPeso();
        msg += "\n\t - Potencia : " + getPotencia() + "kW";
        msg += "\n\t - Número de puertas: " + getNumeroDePuertas();
        msg += "\n\t - Capacidad de carga: " + capacidadCarga + " toneladas";
        msg += "\n\t - Velocidad actual: " + getVelocidad() + " Km/h";
        return msg;
    }
}
