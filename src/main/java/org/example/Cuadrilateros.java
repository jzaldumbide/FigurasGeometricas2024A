package org.example;

public class Cuadrilateros extends FigurasGeometricas{

    Double lado1;
    Double lado2;
    public Cuadrilateros() {}
    public Cuadrilateros(Double lado1, Double lado2) {}


    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double calcularArea() {
        return lado1 * lado2;
    }
}
