package EjercicioCuentaBancariaHerencia;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual, boolean activa) {
        super(saldo, tasaAnual);
        this.activa = activa;
    }

    //metodo retirar(float cantidad)
    //metodo consignar(float cantidad)
    //metodo extractoMensual()
    //metodo imprimirDatos()
}
