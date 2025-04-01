package EjercicioPedido;

public class Pedido {
    private String nombre_plato;
    private double precio;
    private String tipo_pedido;

    public Pedido(String nombre_plato, double precio, String tipo_pedido) {
        this.nombre_plato = nombre_plato;
        this.precio = precio;
        this.tipo_pedido = tipo_pedido;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo_pedido() {
        return tipo_pedido;
    }

    public void setTipo_pedido(String tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
    }


}
