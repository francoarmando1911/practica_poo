package MunicipiosDepartamentos.Municipios;

import java.util.List;

public class Departamento {

    private String nombre;
    private List<Municipio> municipios;

    public Departamento(String nombre, List<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public void agregarMunicipio(Municipio municipio) {
        this.municipios.add(municipio);
    }

    public void eliminarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < this.municipios.size(); i++) {
            if (this.municipios.get(i).getNombre().equals(nombre)) {
                this.municipios.remove(i);
                break;
            }
        }
    }

    public void buscarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < this.municipios.size(); i++) {
            if (this.municipios.get(i).getNombre().equals(nombre)) {
                municipio = this.municipios.get(i);
                break;
            }
            if(!nombre.equals(getNombre())){
                System.out.println("Municipio no encontrado");
            }
        }
    }

    public void buscarMunicipioMayorPoblacion(Integer poblacion) {
        Municipio municipio;
        boolean encontroMunicipios = false;

        for (int i = 0; i < this.municipios.size(); i++) {
            municipio = this.municipios.get(i);

            if (municipio.getPoblacion() >= poblacion) {
                System.out.println(municipio.getNombre());
                encontroMunicipios = true;
            }
        }
        if (!encontroMunicipios) {
            System.out.println("No existe municipios con esa poblacion");
        }
    }


}
