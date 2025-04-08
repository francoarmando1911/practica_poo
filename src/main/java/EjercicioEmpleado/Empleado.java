package EjercicioEmpleado;

/*
Definir una clase Empleado que tiene como atributos: identifica-
dor, nombre, apellidos y edad del empleado. La clase contiene dos
constructores:
○ El primer constructor no tiene parámetros e inicializa los atribu-
tos del objeto con los siguientes valores: identificador del emplea-
do con el valor 100, el nombre con “Nuevo empleado”, apellidos
con “Nuevo empleado” y edad del empleado con 18.
○ El segundo constructor asigna valores a los atributos de acuer-
do con los valores pasados como parámetros.
 */

public class Empleado {

    private int id;
    private String nombre;
    private String apellidos;
    private  int edad;

    public Empleado() {
        this.id = 100;
        this.nombre = "Nuevo empleado";
        this.apellidos = "Nuevo empleado";
        this.edad = 18;
    }

    public Empleado(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
