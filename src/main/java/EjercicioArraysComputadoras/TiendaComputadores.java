package EjercicioArraysComputadoras;

/*
Se requiere desarrollar un programa que modele una tienda de computa-
dores. La tienda posee los siguientes atributos:
u Nombre de la tienda.
u Propietario de la tienda.
u Identificador tributario de la tienda.
 */

public class TiendaComputadores {
    private String nombreTienda;
    private String propiedadTienda;
    private int idTributarioTienda;

    public TiendaComputadores(String nombreTienda, String propiedadTienda, int idTributarioTienda) {
        this.nombreTienda = nombreTienda;
        this.propiedadTienda = propiedadTienda;
        this.idTributarioTienda = idTributarioTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getPropiedadTienda() {
        return propiedadTienda;
    }

    public void setPropiedadTienda(String propiedadTienda) {
        this.propiedadTienda = propiedadTienda;
    }

    public int getIdTributarioTienda() {
        return idTributarioTienda;
    }

    public void setIdTributarioTienda(int idTributarioTienda) {
        this.idTributarioTienda = idTributarioTienda;
    }
}
