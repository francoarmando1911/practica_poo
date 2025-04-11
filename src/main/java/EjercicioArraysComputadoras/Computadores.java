package EjercicioArraysComputadoras;

/*
Los computadores de la tienda tienen los siguientes atributos:
u Marca del computador.
u Cantidad de memoria.
u Características del procesador.
u Sistema operativo.
u Precio del computador.
 */

public class Computadores {
    private String marcaComputador;
    private double cantidadMemoria;
    private String caracteristicaProcesador;
    private String sistemaOperativo;
    private double precioComputador;

    public Computadores(String marcaComputador, double cantidadMemoria, String caracteristicaProcesador, String sistemaOperativo, double precioComputador) {
        this.marcaComputador = marcaComputador;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicaProcesador = caracteristicaProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precioComputador = precioComputador;
    }

    public String getMarcaComputador() {
        return marcaComputador;
    }

    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }

    public double getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(double cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public String getCaracteristicaProcesador() {
        return caracteristicaProcesador;
    }

    public void setCaracteristicaProcesador(String caracteristicaProcesador) {
        this.caracteristicaProcesador = caracteristicaProcesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecioComputador() {
        return precioComputador;
    }

    public void setPrecioComputador(double precioComputador) {
        this.precioComputador = precioComputador;
    }

    /*El programa debe poseer métodos que permitan:
    u Agregar un computador a la tienda.
    u Eliminar un computador de la tienda dada su marca.
    u Buscar un computador en la tienda dada su marca.
    u Listar la información de todos los computadores que tiene la tienda.
     */




}
