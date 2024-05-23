package org.example;

public class Triangulos extends FigurasGeometricas{
    Double base;
    Double altura;

    public Triangulos(Double base, Double altura) {}
    public Triangulos() {}

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calcularArea() {
        return base*altura;
    }
}
