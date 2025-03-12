package Ejercicios;

/*
Crea una clase figura con un metodo calcularArea. Luego, crear una clase circulo que herede de figura
y sobreescriba el metodocalcularArea para calcular el area de un circulo.
 */

import java.lang.Math;

public abstract class Figura {
    public abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
class Main {
    public static void main(String[] args) {
        double radio = 5.0;
        Circulo circulo = new Circulo(radio);

        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);
    }
}
