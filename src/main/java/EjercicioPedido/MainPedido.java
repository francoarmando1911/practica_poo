package EjercicioPedido;
/**
Realizar un programa en Java que permita calcular el pedido que realiza un
cliente en un restaurante.

Los pedidos de un restaurante están conformados por las siguientes
partes:
u Un primer plato.
u Un segundo plato.
u Una bebida.
u Un postre.
Cada uno de dichas partes tiene un nombre y un valor. Se requiere
definir métodos sobrecargados para calcular el valor del pedido depen-
diendo si el cliente solicita:
u Un primer plato y una bebida.
u Un primer plato, un segundo plato y una bebida.
u Un primer plato, un segundo plato, una bebida y un postre.
Implementar un método main que utilice los tres métodos sobrecar-
gados en tres diferentes pedidos.
 **/
public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Fideos", 4000, "Pollo", 3500, "coca", 3000, "chocotorta", 2000);

        double pedido1 = pedido.calcularPedido("Fideos", 4000, "coca", 3000);
        System.out.println("El costo total del pedido 1 es: " + pedido1);

        double pedido2 = pedido.calcularPedido("Fideos", 4000, "Pollo", 3500, "coca", 3000);
        System.out.println("El costo total del pedido 2 es: " + pedido2);

        double pedido3 = pedido.calcularPedido("Fideos", 4000, "Pollo", 3500, "coca", 3000, "chocotorta", 2000);
        System.out.println("El costo total del pedido 3 es: " + pedido3);
    }
}
