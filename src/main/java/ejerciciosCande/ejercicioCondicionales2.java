package ejerciciosCande;

/*
Si el precio del producto es menor a $2000 imprimir que esta barato, sino imprimir que esta caro
 */
public class ejercicioCondicionales2 {
    public static void main(String[] args) {

        double precioProducto = 5500;

        if(precioProducto <= 2000){
            System.out.println("El precio del producto es barato.");
        } else{
            System.out.println("El precio del producto es caro.");
        }
    }
}
