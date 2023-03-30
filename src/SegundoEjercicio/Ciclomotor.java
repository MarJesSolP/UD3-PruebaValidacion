package SegundoEjercicio;

public class Ciclomotor extends Vehiculo {
    private boolean autopista;

    public Ciclomotor(String marca, float peso, int potencia, int numeroDePuertas, int velocidad, boolean autopista) {
        super(marca, peso, potencia, numeroDePuertas, velocidad);
        this.autopista = autopista;
    }

    @Override
    public int acelerar(int velocidad) {
        return velocidad + 7;
    }

    @Override
    public String toString() {
        String msg = "Tipo de vehículo: Ciclomotor ";
        msg += "\n\t - Marca : " + getMarca();
        msg += "\n\t - Peso : " + getPeso();
        msg += "\n\t - Potencia : " + getPotencia();
        msg += "\n\t - Número de puertas: " + getNumeroDePuertas();
        msg += "\n\t - Puede ir por autopista: " + autopista;
        String yesOrNo = "";
        if (autopista) {
            yesOrNo = "Sí";
        } else yesOrNo = "No";
        msg += "\n\t - Velocidad actual: " + getVelocidad();
        return msg;
    }
}
