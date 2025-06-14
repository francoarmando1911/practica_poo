package EjerciciosArrays;

/*
u Desarrollar un programa que, dado un número entero, busque di-
cho número en un array.
 */

public class EnteroArray {
    public static void main(String[] args) {

        int entero = 10;

        int[] numerosEnteros = {4, 5, 8, 10, 100, 200, 500, 700, 45, 65, 70, 14, 15, 13};

        for(int numero : numerosEnteros) {
            if(numero == entero){
                System.out.println("Numero coincide: " + entero);
            } else {
                System.out.println("Numero no coincide: " + entero);
            }
        }

    }
}
