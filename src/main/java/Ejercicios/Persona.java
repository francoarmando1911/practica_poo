package Ejercicios;

import java.util.Scanner;

/*
Crea una clase persona que contenga atributos, nombre, apellido, edad, dni. Incluye metodos para
establecer y obtener los valores de estos atributos, asi como un metodo que muestre la informacion de
la personna
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private float dni;

    public Persona(String nombre, String apellido, int edad, float dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDni() {
        return dni;
    }

    public void setDni(float dni) {
        this.dni = dni;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre de la persona: " + nombre);
        System.out.println("Apellido de la persona: " + apellido);
        System.out.println("Edad de la persona: " + edad);
        System.out.println("Dni de la persona: " + dni);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Persona persona = new Persona("Franco", "Armando", 22, 96107991);
        persona.mostrarInformacion();

    }
}
