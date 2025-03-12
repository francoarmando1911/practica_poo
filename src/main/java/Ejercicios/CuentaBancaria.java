package Ejercicios;

import java.util.Scanner;

/*
Crear una clase cuenta bancaria con atributos nuevaCuenta, saldo y titular. Incluir metodos
para depositary retirar dinero, asi como un metodo que muestre la informacion de la persona.
 */
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodos para depositar
    public static double depositar(double saldo, double montoDepositar){
        Scanner entrada = new Scanner(System.in);

        double nuevoSaldo = 0;
        System.out.println("Desea ingresar dinero (s/n)? ");
        String respuesta = entrada.next();

        if(respuesta.equals("n")){
            System.out.println("Tarea finalizada.");
        }else {
            System.out.println("Ingrese el monto que desea depositar en su cuenta: ");
            montoDepositar = entrada.nextDouble();
            nuevoSaldo = (saldo + montoDepositar);
        }
        entrada.close();
        return nuevoSaldo;
    }

    //Funcion retirar dinero
    public static double retirarDinero(double saldo, double montoRetirar){
        Scanner entrada  = new Scanner(System.in);

        double saldoRetirar = 0;
        System.out.println("Desea retirar dinero de su cuenta bancaria (s/n): ");
        String respuesta = entrada.next();

        if(respuesta.equals("n")){
            System.out.println("Tarea finalizada.");
        } else {
            System.out.println("Ingrese el monto que desea retirar de su cuenta bancaria: ");
            montoRetirar = (saldo - saldoRetirar);
        }
        entrada.close();
        return montoRetirar;
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("12345", 50000, "Franco");

        cuentaBancaria.depositar();
        cuentaBancaria.retirarDinero();

    }
}
