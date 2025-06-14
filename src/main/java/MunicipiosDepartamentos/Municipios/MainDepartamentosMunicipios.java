package MunicipiosDepartamentos.Municipios;

import java.util.ArrayList;
import java.util.List;

public class MainDepartamentosMunicipios {
    public static void main(String[] args) {
        Municipio municipio1 = new Municipio("Manizales", 400000, 17d, 2200d);
        Municipio municipio2 = new Municipio("La Dorada", 98000, 28d, 1000d);
        Municipio municipio3 = new Municipio("Neira", 30000, 20d, 1969d);
        List municipios = new ArrayList();
        municipios.add(municipio1);
        municipios.add(municipio2);
        municipios.add(municipio3);
        Departamento departamento = new Departamento("Caldas", municipios);
        System.out.println("Municipios con población mayor a 50.000");
        departamento.buscarMunicipioMayorPoblacion(50000);
        System.out.println("Búsqueda del municipio de Manizales");
        departamento.buscarMunicipio("Manizales");
    }
}
