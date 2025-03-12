package Ejercicios;

import java.util.Scanner;

public class CuentaBancaria {
    private String nuevaCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String nuevaCuenta, double saldo, String titular) {
        this.nuevaCuenta = nuevaCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNuevaCuenta() {
        return nuevaCuenta;
    }

    public void setNuevaCuenta(String nuevaCuenta) {
        this.nuevaCuenta = nuevaCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método para depositar dinero
    public void depositar(double montoDepositar) {
        if (montoDepositar > 0) {
            saldo += montoDepositar;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    // Método para retirar dinero
    public void retirarDinero(double montoRetirar) {
        if (montoRetirar > 0 && montoRetirar <= saldo) {
            saldo -= montoRetirar;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + nuevaCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CuentaBancaria cuentaBancaria = new CuentaBancaria("12345", 50000, "Franco");

        cuentaBancaria.mostrarInformacion();

        // Pedir al usuario que ingrese dinero
        System.out.print("Ingrese el monto a depositar: ");
        double montoDepositar = entrada.nextDouble();
        cuentaBancaria.depositar(montoDepositar);

        // Pedir al usuario que retire dinero
        System.out.print("Ingrese el monto a retirar: ");
        double montoRetirar = entrada.nextDouble();
        cuentaBancaria.retirarDinero(montoRetirar);

        cuentaBancaria.mostrarInformacion();
        entrada.close();
    }
}
