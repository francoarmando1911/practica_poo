package EjercicioCuentaBancariaHerencia;

public class CuentaCorriente extends Cuenta{

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    //metodo retirar(float cantidad)
    //metodo consignar(float cantidad)
    //metodo extractoMensual()
    //metodo imprimirDatos()
}
