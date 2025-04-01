package EjercicioAvion;
/**
Se tiene un código que modela una clase Avión que posee dos atributos:
nombre del fabricante del avión (tipo String) y número de motores del
avión (tipo int). La clase tiene un constructor y métodos get y set para cada
atributo. Además, tiene los siguientes métodos adicionales:
u Un método denominado imprimirFabricante(), que muestra en
pantalla el nombre del fabricante de un avión.
u Un método denominado cambiarFabricante(Avión a), que recibe
como parámetro un objeto de tipo Avión y le cambia el valor de su
atributo fabricante a un valor predefinido “Loockhead”.
En el método main se crean dos aviones: a1 (fabricante “Airbus” con
cuatro motores) y a2 (fabricante “Lookheed” con cuatro motores). Luego,
los datos de cada avión se imprimen por pantalla. Después, se realizan lla-
madas a los métodos setFabricante y cambiarFabricante, los cuales cambia-
rán los valores de sus atributos. ¿Cuál es el resultado final de la
 **/
public class MainAvion {
    public static void main(String[] args) {

        Avion a1 = new Avion("Airbus", 2);
        Avion a2 = new Avion("Loockheed", 4);

        System.out.println(a1);
        System.out.println(a2);

        String nuevoFabricante = a1.cambiarFabricante();
        System.out.println("Nuevo fabricante de a1: " + nuevoFabricante);

        System.out.println(a1);
    }
}
