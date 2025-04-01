package ConversorMetros;

import java.util.Scanner;

/**
 Realizar un programa en Java que permita realizar las siguientes conversio-
 nes de unidades de longitud:
 u Metros a centímetros.
 u Metros a milímetros.
 u Metros a pulgadas.
 u Metros a pies.
 u Metros a yardas.
 **/
public class MainConversorMetros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor a convertir: ");
        double valorConvertir = entrada.nextDouble();
        System.out.println("Ingrese que conversion quiere realizar: " +
                "(1- Metros a centimetros)" +
                "(2- Metros a milimetros)" +
                "(3- Metros a pulgadas)" +
                "(4- Metros a pies)" +
                "(5- Metros a yardas)");
        int unidad = entrada.nextInt();

        Conversiones conversion = new Conversiones();
        double resultado = conversion.conversiones(unidad, valorConvertir);
        System.out.println("El resultado de la conversión es: " + resultado);
    }
}
