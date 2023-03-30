package SegundoEjercicio;

public class Vehiculo {
    private String marca;
    private float peso;
    private int potencia;
    private int numeroDePuertas;
    private int velocidad;

    public Vehiculo(String marca, float peso, int potencia, int numeroDePuertas, int velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numeroDePuertas = numeroDePuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public int acelerar(int velocidad) {
        return velocidad += 10;
    }


}
