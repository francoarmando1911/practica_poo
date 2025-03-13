package Ejercicios;

/*
Clase Persona - Condiciones:

Atributos:
- Nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
- No se debe acceder directamente a los atributos, elegir el modificador de acceso adecuado.
- Valores por defecto:
  - Números en 0, cadenas vacías para String.
  - Sexo por defecto será hombre (usar una constante).
- Se pueden agregar más atributos si es necesario.

Constructores:
1. Constructor por defecto.
2. Constructor con nombre, edad y sexo (el resto por defecto).
3. Constructor con todos los atributos como parámetros.

Métodos:
- calcularIMC(): Calcula el índice de masa corporal (IMC).
  - IMC = peso en kg / (altura^2 en m).
  - Retorna:
    - -1 si el IMC es menor que 20 (bajo peso).
    - 0 si el IMC está entre 20 y 25 (peso ideal).
    - 1 si el IMC es mayor que 25 (sobrepeso).
  - Se recomienda usar constantes para estos valores de retorno.

- esMayorDeEdad(): Indica si la persona es mayor de edad (retorna booleano).

- comprobarSexo(char sexo):
  - Verifica si el sexo ingresado es válido.
  - Si no es válido, asigna 'H' por defecto.
  - No debe ser visible desde fuera de la clase.

- toString(): Devuelve toda la información del objeto.

- generaDNI():
  - Genera un número aleatorio de 8 cifras y su letra correspondiente.
  - Se debe invocar automáticamente al construir el objeto.
  - Se puede dividir en submétodos para facilitar su implementación.
  - No debe ser visible desde fuera de la clase.

- Métodos set para cada atributo, excepto DNI.

Clase Ejecutable:
1. Pedir por teclado: nombre, edad, sexo, peso y altura.
2. Crear 3 objetos de la clase Persona:
   - El primer objeto recibe los valores ingresados por teclado.
   - El segundo objeto recibe nombre, edad y sexo, el resto queda por defecto.
   - El tercer objeto se crea con valores por defecto y luego se asignan valores con métodos set.
3. Para cada objeto:
   - Verificar si está en su peso ideal, tiene sobrepeso o está por debajo del peso ideal.
   - Indicar si es mayor de edad.
   - Mostrar su información completa usando toString().
4. Se pueden usar métodos auxiliares en la clase ejecutable para organizar mejor el código.
*/

import java.util.Scanner;

public class Imc {
    class Persona{
        private String nombre;
        private int edad;
        private int dni;
        private String sexo;
        private double peso;
        private double altura;

        private static final String SEXO_DEFECTO = "H";

        public Persona(String nombre, int edad, String sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = generaDNI();
            this.sexo = comprobarSexo(sexo);
            this.peso = 0;
            this.altura = 0;
        }

        //Constructor con todos los atributos
        public Persona(String nombre, int edad, int dni, String sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = generaDNI();
            this.sexo = comprobarSexo(sexo);
            this.peso = 0;
            this.altura = 0;
        }

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getDni() {
            return dni;
        }
        public void setDni(int dni) {
            this.dni = dni;
        }
        public String getSexo() {
            return sexo;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        public double getPeso() {
            return peso;
        }
        public void setPeso(double peso) {
            this.peso = peso;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }

        private String comprobarSexo(String sexo){
            if(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")){
                return sexo;
            }
            return SEXO_DEFECTO;
        }

        private int generaDNI(){
            int numero = (int)(Math.random() * 90000000) + 10000000;
            return numero;
        }

        //toString para mostrar la informacion de la persona
        @Override
        public String toString(){
            return "Nombre " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", Sexo: " + sexo +
                    ", Peso: " + peso + "kg, Altura: " + altura + "m";
        }
    }
    class Main3{
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.next();
            System.out.print("Edad: ");
            int edad = entrada.nextInt();
            System.out.print("Ingrese su DNI: ");
            String dni = entrada.next();
            System.out.print("Ingrese su sexo (H/M): ");
            String sexo = entrada.next();
            System.out.print("Ingrese su peso (kg): ");
            double peso = entrada.nextDouble();
            System.out.print("Ingrese su altura (m): ");
            double altura = entrada.nextDouble();

            // Crear objeto Persona con los datos ingresados
            //Persona persona = new Persona(nombre, edad, dni, sexo, peso, altura);

            System.out.println("\nInformación de la persona:");
            //System.out.println(persona);
        }
    }
}
