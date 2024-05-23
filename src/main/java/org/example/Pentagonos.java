package org.example;

public class Pentagonos extends FigurasGeometricas {
    Double longitudLado;

    public Pentagonos() {
    }

    public Pentagonos(String nombre, int nLados, Double longitudLado) {
        super(nombre, nLados);
    }


    public Double calcularArea() {
        return Math.PI * Math.pow(nLados, longitudLado);//esta no es la formula
    }
}
