package Ejercicios;

import java.util.Scanner;

public class Cuentabancaria2 {
    String nombre_titular;
    String apellido_titular;
    Double numero_cuentaBancaria;
    String tipo_cuentaBancaria; //Puede ser cuenta ahorro o cuenta corriente
    Double saldo_cuentaBancaria = 0.0;

    public Cuentabancaria2(String nombre_titular, String apellido_titular, Double numero_cuentaBancaria, String tipo_cuentaBancaria) {
        this.nombre_titular = nombre_titular;
        this.apellido_titular = apellido_titular;
        this.numero_cuentaBancaria = numero_cuentaBancaria;
        this.tipo_cuentaBancaria = tipo_cuentaBancaria;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public String getApellido_titular() {
        return apellido_titular;
    }

    public void setApellido_titular(String apellido_titular) {
        this.apellido_titular = apellido_titular;
    }

    public String getTipo_cuentaBancaria() {
        return tipo_cuentaBancaria;
    }

    public void setTipo_cuentaBancaria(String tipo_cuentaBancaria) {
        this.tipo_cuentaBancaria = tipo_cuentaBancaria;
    }

    public Double getSaldo_cuentaBancaria() {
        return saldo_cuentaBancaria;
    }

    public void setSaldo_cuentaBancaria(Double saldo_cuentaBancaria) {
        this.saldo_cuentaBancaria = saldo_cuentaBancaria;
    }

    public Double getNumero_cuentaBancaria() {
        return numero_cuentaBancaria;
    }

    public void setNumero_cuentaBancaria(Double numero_cuentaBancaria) {
        this.numero_cuentaBancaria = numero_cuentaBancaria;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + nombre_titular);
        System.out.println("Apellido del titular: " + apellido_titular);
        System.out.println("Numero de cuenta bancaria: " + numero_cuentaBancaria);
        System.out.println("Tipo de cuenta bancaria: " + tipo_cuentaBancaria);
        System.out.println("Saldo del cuenta: " + saldo_cuentaBancaria);
    }

    public double consultarSaldo() {
        return saldo_cuentaBancaria;
    }

    public void consignarSaldo(double valor) {
        saldo_cuentaBancaria += valor;
        System.out.println("Se ha consignado: $" + valor);
        System.out.println("Saldo actual: $" + saldo_cuentaBancaria);
    }

    public void retirarSaldo(double valor) {
        if (valor <= saldo_cuentaBancaria) {
            saldo_cuentaBancaria -= valor;
            System.out.println("Se ha retirado: $" + valor);
            System.out.println("Saldo actual: $" + saldo_cuentaBancaria);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular: ");
        String nombre_titular = entrada.nextLine();

        System.out.println("Ingrese el apellido del titular: ");
        String apellido_titular = entrada.nextLine();

        System.out.println("Ingrese el numero de cuenta bancaria: ");
        Double numero_cuentaBancaria = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el tipo de cuenta bancaria (ahorro - corriente): ");
        String tipo_cuentaBancaria = entrada.nextLine();

        Cuentabancaria2 cuenta = new Cuentabancaria2(nombre_titular, apellido_titular, numero_cuentaBancaria, tipo_cuentaBancaria);

        boolean salir = false;

        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar información de la cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Consignar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Salir");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarInformacion();
                    break;
                case 2:
                    System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
                    break;
                case 3:
                    System.out.println("Ingrese el valor a consignar: ");
                    double valorConsignar = entrada.nextDouble();
                    cuenta.consignarSaldo(valorConsignar);
                    break;
                case 4:
                    System.out.println("Ingrese el valor a retirar: ");
                    double valorRetirar = entrada.nextDouble();
                    cuenta.retirarSaldo(valorRetirar);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        entrada.close();
    }
}
