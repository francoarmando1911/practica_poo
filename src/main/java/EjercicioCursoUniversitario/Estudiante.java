package EjercicioCursoUniversitario;

public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private String apellido;
    private int numeroSemestre;
    private double notaFinal;

    public Estudiante(int idEstudiante, String nombre, String apellido, int numeroSemestre, double notaFinal) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSemestre = numeroSemestre;
        this.notaFinal = notaFinal;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    /*
    ○ Añadir un estudiante al curso: se ingresan por teclado los datos
    del estudiante. El código del estudiante debe ser único, si el có-
    digo ya existe se debe generar el mensaje correspondiente.

    ○ Buscar un estudiante de acuerdo con su código ingresado por
    teclado: si se encuentra muestra los datos del estudiante. De lo
    contrario, debe mostrar el mensaje correspondiente.

    ○ Eliminar un estudiante de acuerdo con su código ingresado por
    teclado: si se encuentra muestra los datos del estudiante y se
    solicita una confirmación de la eliminación. Si no, debe mostrar
    el mensaje correspondiente.
     */
}
