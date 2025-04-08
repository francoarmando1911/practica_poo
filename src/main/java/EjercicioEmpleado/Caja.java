package EjercicioEmpleado;

/*
 Definir una clase Caja que tiene como atributos la longitud de su
base, anchura y altura. La clase contiene tres constructores:
○ El primer constructor asigna valores a los atributos de acuerdo
con los valores pasados como parámetros.
○ El segundo constructor inicializa todos los atributos de una caja
con valores de cero.
○ El tercer constructor recibe un parámetro de longitud y les asig-
na dicho valor a todos sus atributos.
○ Definir un nuevo atributo que represente el tipo de caja y un
nuevo constructor que reciba como parámetros los valores de
los cuatro atributos. Este constructor debe invocar al primero.
 */
public class Caja {

    private double longitudBase;
    private double ancho;
    private double altura;
    private String tipoDeCaja;

    public Caja(double longitudBase, double altura, double ancho) {
        this.longitudBase = longitudBase;
        this.altura = altura;
        this.ancho = ancho;
    }

    public Caja() {
        this.longitudBase = 0;
        this.altura = 0;
        this.ancho = 0;
    }

    public Caja(double longitudBase, double altura, double ancho, String tipoDeCaja) {
        this(longitudBase, altura, ancho);
        this.tipoDeCaja = tipoDeCaja;
    }

}
