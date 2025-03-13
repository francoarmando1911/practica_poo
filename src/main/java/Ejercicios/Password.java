package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Haz una clase llamada Password que siga las siguientes condiciones:

- Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
- Un constructor por defecto.
- Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.

Los métodos que implementa serán:
- esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1
minúscula y mas de 5 números.
- generarPassword():  genera la contraseña del objeto con la longitud que tenga.
- Método get para contraseña y longitud.
- Método set para longitud.

Ahora, crea una clase clase ejecutable:
- Crea un array de Passwords con el tamaño que tu le indiques por teclado.
- Crea un bucle que cree un objeto para cada posición del array.
- Indica también por teclado la longitud de los Passwords (antes de bucle).
- Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
- Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato: contraseña1 valor_booleano1
 */
public class Password {

    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        this.contrasena = generarContrasena(this.longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarContrasena(this.longitud);
    }

    //Metodo para generar una contraseña aleatoria
    private String generarContrasena(int longitud){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = mayusculas + minusculas + numeros;

        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < longitud; i++){
            //Selecciono un indice aleatorio
            int indice = random.nextInt(caracteres.length());
            //Agrego el caracter a la contraseña
            contrasena.append(caracteres.charAt(indice));
        }

        return contrasena.toString();
    }

    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        //Rrecorrer la contraseña caracter por caracter

        for(int i = 0; i < contrasena.length(); i++){
            char caracter = contrasena.charAt(i);

            if(Character.isUpperCase(caracter)){
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        //Evaluar si cumple con los requisitros para ser una contraseña fuerte
        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

class Main2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir el tamaño del array
        System.out.print("Ingrese el número de contraseñas a generar: ");
        int cantidad = scanner.nextInt();

        Password[] passwords = new Password[cantidad];
        boolean[] esFuerteArray = new boolean[cantidad];

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(passwords[i].getContrasena() + " " + esFuerteArray[i]);
        }
        scanner.close();
    }
}
