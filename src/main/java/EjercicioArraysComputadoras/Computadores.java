package EjercicioArraysComputadoras;

/*
Los computadores de la tienda tienen los siguientes atributos:
u Marca del computador.
u Cantidad de memoria.
u Características del procesador.
u Sistema operativo.
u Precio del computador.
 */

import java.util.List;

public class Computadores {
    private String marcaComputador;
    private double cantidadMemoria;
    private String caracteristicaProcesador;
    private String sistemaOperativo;
    private double precioComputador;
    private List<Computadores> inventario;

    public Computadores(List<Computadores> inventario) {
        this.inventario = inventario;
    }

    public Computadores(String marcaComputador, double cantidadMemoria, String caracteristicaProcesador, String sistemaOperativo, double precioComputador) {
        this.marcaComputador = marcaComputador;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicaProcesador = caracteristicaProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precioComputador = precioComputador;

    }

    public List<Computadores> getInventario() {
        return inventario;
    }

    public void setInventario(List<Computadores> inventario) {
        this.inventario = inventario;
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

    // Método para agregar un computador
    public void agregarComputador(Computadores computador) {
        inventario.add(computador);
    }

    // Método para eliminar un computador por su marca
    public boolean eliminarComputadorPorMarca(String marca) {
        return inventario.removeIf(computador -> computador.getMarcaComputador().equalsIgnoreCase(marca));
    }

    // Método para buscar un computador por su marca
    public Computadores buscarComputadorPorMarca(String marca) {
        for (Computadores computador : inventario) {
            if (computador.getMarcaComputador().equalsIgnoreCase(marca)) {
                return computador;
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

    // Método para listar todos los computadores
    public void listarComputadores() {
        for (Computadores computador : inventario) {
            System.out.println("Marca: " + computador.getMarcaComputador() +
                    ", Memoria: " + computador.getCantidadMemoria() +
                    "GB, Procesador: " + computador.getCaracteristicaProcesador() +
                    ", SO: " + computador.getSistemaOperativo() +
                    ", Precio: $" + computador.getPrecioComputador());
        }
    }




}
