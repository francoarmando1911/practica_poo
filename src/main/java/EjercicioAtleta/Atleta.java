package EjercicioAtleta;

/**
 Además, se tienen los siguientes atributos estáticos:
 u Un contador con la cantidad de atletas creados, el cual servirá
 como identificador de un atleta.
 u Un atributo estático denominado selección de tipo String con el
 valor “Colombia”.
 u Un atributo estático denominado tiempoEquipo que sume los valo-
 res de tiempo obtenidos por un equipo de atletas.
 **/

public class Atleta {

    private static int contador = 0;
    private int identificador;
    private String nombre;
    private Double tiempoPrueba400;

    static String selección = "Colombia";
    static double tiempoEquipo;

    public Atleta(String nombre, Double tiempoPrueba400) {
        contador++;
        identificador = contador;
        this.nombre = nombre;
        this.tiempoPrueba400 = tiempoPrueba400;
    }

    public void correr400metros() {
        tiempoEquipo = tiempoEquipo + tiempoPrueba400;
    }

    public void imprimir() {
        System.out.println("Identificador del atleta = " + identificador);
        System.out.println("Nombre del atleta = " + nombre);
        System.out.println("Tiempo del atleta = " + tiempoPrueba400 + " segundos");
        System.out.println();
    }

    public static void imprimirSelección() {
        System.out.println("Seleccion = " + selección);
    }

    public static void imprimirTiempoEquipo() {
        System.out.println("Tiempo de equipo = " + tiempoEquipo + " segundos");
    }

}
