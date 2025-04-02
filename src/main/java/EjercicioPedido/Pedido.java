package EjercicioPedido;

public class Pedido {

    private String primerPlato;
    private double costoPrimerPlato;
    private String sgundoPlato;
    private double costoSegundoPlato;
    private String bebida;
    private double costoBebida;
    private String postre;
    private double costoPostre;

    public Pedido(String primerPlato, double costoPrimerPlato, String sgundoPlato, double costoSegundoPlato,
                  String bebida, double costoBebida, String postre, double costoPostre) {
        this.primerPlato = primerPlato;
        this.costoPrimerPlato = costoPrimerPlato;
        this.sgundoPlato = sgundoPlato;
        this.costoSegundoPlato = costoSegundoPlato;
        this.bebida = bebida;
        this.costoBebida = costoBebida;
        this.postre = postre;
        this.costoPostre = costoPostre;
    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public String getSgundoPlato() {
        return sgundoPlato;
    }

    public void setSgundoPlato(String sgundoPlato) {
        this.sgundoPlato = sgundoPlato;
    }

    public double getCostoPrimerPlato() {
        return costoPrimerPlato;
    }

    public void setCostoPrimerPlato(double costoPrimerPlato) {
        this.costoPrimerPlato = costoPrimerPlato;
    }

    public double getCostoSegundoPlato() {
        return costoSegundoPlato;
    }

    public void setCostoSegundoPlato(double costoSegundoPlato) {
        this.costoSegundoPlato = costoSegundoPlato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public double getCostoBebida() {
        return costoBebida;
    }

    public void setCostoBebida(double costoBebida) {
        this.costoBebida = costoBebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public double getCostoPostre() {
        return costoPostre;
    }

    public void setCostoPostre(double costoPostre) {
        this.costoPostre = costoPostre;
    }

    //Metodo para calcular el valor del pedido dependiendo si el cliente solicita:
    //u Un primer plato y una bebida.
    //u Un primer plato, un segundo plato y una bebida.
    //u Un primer plato, un segundo plato, una bebida y un postre.

    public static double calcularPedido(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida){
        return costoPrimerPlato + costoBebida;
    }

    public static double calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida){
        return costoPrimerPlato + costoSegundoPlato + costoBebida;
    }

    public static double calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida, String postre, double costoPostre){
        return costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
    }
}
