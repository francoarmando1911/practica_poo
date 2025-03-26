package Ejercicios;
/*
Realizar un programa en Java que defina una clase Película con los siguientes atributos privados:

- Nombre: es el nombre de la película y es de tipo String.
- Director: representa el nombre del director de la película y es de tipo String.
- Género: es el género de la película, un tipo enumerado con los siguientes valores: ACCIÓN, COMEDIA, DRAMA y SUSPENSO.
- Duración: duración de la película en minutos, esta es de tipo int.
- Año: representa el año de realización de la película.
- Calificación: es la valoración de la película por parte de sus usuarios y es de tipo double.

Se debe definir un constructor público para la clase, que recibe como parámetros los valores de todos sus atributos.

También se deben definir los siguientes métodos:

- Métodos get y set para cada atributo, con los derechos de acceso:
    * get: públicos
    * set: privados

- Un método imprimir público que muestre en pantalla los valores de los atributos.

- Un método privado boolean esPeliculaEpica(), el cual devuelve un valor verdadero si la duración de la película es mayor o igual a tres horas, en caso contrario
devuelve falso.

- Un método privado String calcularValoración(), el cual según la tabla 2.5 devuelve una valoración subjetiva.
*/

public class Pelicula {

    private String nombre_pelicula;
    private String nombre_director;

    public enum Genero{
        ACCION,
        COMEDIA,
        DRAMA,
        SUSPENSO
    }

    private Integer duracion_pelicula = 0;
    private Integer anio_pelicula = 0;
    private Double calificacion = 0.0;

    public Pelicula(String nombre_pelicula, String nombre_director, Integer anio_pelicula, Integer duracion_pelicula, Double calificacion) {
        this.nombre_pelicula = nombre_pelicula;
        this.nombre_director = nombre_director;
        this.anio_pelicula = anio_pelicula;
        this.duracion_pelicula = duracion_pelicula;
        this.calificacion = calificacion;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    private void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getNombre_director() {
        return nombre_director;
    }

    private void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

    public Integer getAnio_pelicula() {
        return anio_pelicula;
    }

    private void setAnio_pelicula(Integer anio_pelicula) {
        this.anio_pelicula = anio_pelicula;
    }

    public Integer getDuracion_pelicula() {
        return duracion_pelicula;
    }

    private void setDuracion_pelicula(Integer duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    private void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    /*Metodo privado esPeliculaEpica() devuelve un valor verdadero si la duración de la película es mayor o igual a tres horas,
    en caso contrario devuelve falso.*/

    /*Método privado String calcularValoración(), el cual según la tabla 2.5 devuelve una valoración subjetiva.*/

    public void mostrarDatos(){
        System.out.println("Nombre de la pelicula: " + nombre_pelicula);
        System.out.println("Nombre del director: " + nombre_director);
        System.out.println("Genero de la pelicula: " );
        System.out.println("Duracion de la pelicula: " + duracion_pelicula);
        System.out.println("Año de la pelicula: " + anio_pelicula);
        System.out.println("Calificacion de la pelicula: " + calificacion);
    }

    private boolean esPeliculaEpica() {
        return duracion_pelicula >= 180;
    }

    private String calcularValoracion() {
        if (calificacion >= 9) {
            return "Excelente";
        } else if (calificacion >= 7) {
            return "Buena";
        } else if (calificacion >= 5) {
            return "Regular";
        } else {
            return "Mala";
        }
    }

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("El señor de los anillos", "Peter Jackson", 2001, 180, 9.5);
        pelicula.mostrarDatos();
        System.out.println("Es pelicula epica: " + pelicula.esPeliculaEpica());
        System.out.println("Valoracion: " + pelicula.calcularValoracion());
    }
}
