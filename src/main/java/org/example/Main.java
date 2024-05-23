package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FigurasGeometricas miFigura1= new FigurasGeometricas();
        Circulos mifigura2= new Circulos();
        Triangulos mifigura3= new Triangulos();
        Cuadrilateros mifigura4= new Cuadrilateros();

        Circulos mifigura5= new Circulos(3.00);
        Triangulos mifigura6=new Triangulos(6.00,8.00);
        Cuadrilateros mifigura7=new Cuadrilateros(5.00,5.00);
        Cuadrilateros mifigura8=new Cuadrilateros(5.00,10.00);

        mifigura2.setNombre("Pileta del CEC");
        System.out.println(mifigura2.getNombre());

        System.out.println("La nueva pileta tendrá un radio de:");
        mifigura2.setRadio(4.00);
        System.out.println(mifigura2.getRadio());

        System.out.println("Y su área será");
        System.out.println(mifigura2.calcularArea());

    mifigura3.setBase(2.0);
    mifigura3.setAltura(5.0);
    System.out.println("El área del triángulo es:");
    System.out.println(mifigura3.calcularArea());

    }
}