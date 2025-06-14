package EjerciciosArrays;

/*
u Desarrollar un programa que determine el elemento mayor y me-
nor de un array de enteros.
 */

import java.lang.reflect.Array;

public class ElementoMayorMenor {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 7, 9, 10, 70, 1};

        int mayor = numeros[0];
        int menor = numeros[0];

        for(int numero : numeros){
            if(numero > mayor) {
                mayor = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }

        System.out.println("Elemento mayor: " + mayor);
        System.out.println("Elemento menor: " + menor);
    }
}
