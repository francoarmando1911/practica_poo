package EjercicioAvion;

public class Avion {

    private String nombre_fabricante;
    private Integer numero_motores;

    // Constructor
    public Avion(String nombre_fabricante, Integer numero_motores) {
        this.nombre_fabricante = nombre_fabricante;
        this.numero_motores = numero_motores;
    }

    // Getters y Setters
    public String getNombre_fabricante() {
        return nombre_fabricante;
    }

    public void setNombre_fabricante(String nombre_fabricante) {
        this.nombre_fabricante = nombre_fabricante;
    }

    public Integer getNumero_motores() {
        return numero_motores;
    }

    public void setNumero_motores(Integer numero_motores) {
        this.numero_motores = numero_motores;
    }

    public String imprimirFabricante() {
        return this.nombre_fabricante.toUpperCase();
    }

    public String cambiarFabricante() {
        this.nombre_fabricante = "Loockheed";
        return this.nombre_fabricante.toUpperCase();
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nombre_fabricante='" + nombre_fabricante + '\'' +
                ", numero_motores=" + numero_motores +
                '}';
    }
}
