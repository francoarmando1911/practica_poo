package MunicipiosDepartamentos.Municipios;

public class Municipio {

    private String nombre;
    private Integer poblacion;
    private Double temperaturaMedia;
    private Double altitud;

    public Municipio(String nombre, Integer poblacion, Double temperaturaMedia, Double altitud) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.temperaturaMedia = temperaturaMedia;
        this.altitud = altitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public Double getAltitud() {
        return altitud;
    }

    public void setAltitud(Double altitud) {
        this.altitud = altitud;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", temperaturaMedia=" + temperaturaMedia +
                ", altitud=" + altitud +
                '}';
    }
}
