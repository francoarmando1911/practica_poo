package Ejercicios;

import java.util.Scanner;

/**
 * Se requiere un programa que modele una cuenta bancaria que posee los siguientes atributos:
 * - Nombres del titular.
 * - Apellidos del titular.
 * - Número de la cuenta bancaria.
 * - Tipo de cuenta: puede ser una cuenta de ahorros o una cuenta corriente.
 * - Saldo de la cuenta.
 *
 * Se debe definir un constructor que inicialice los atributos de la clase.
 * Cuando se crea una cuenta bancaria, su saldo inicial tiene un valor de cero.
 *
 * En una determinada cuenta bancaria se puede:
 * - Imprimir por pantalla los valores de los atributos de una cuenta bancaria.
 * - Consultar el saldo de una cuenta bancaria.
 * - Consignar un determinado valor en la cuenta bancaria, actualizando el saldo correspondiente.
 * - Retirar un determinado valor de la cuenta bancaria, actualizando el saldo correspondiente.
 *   Es necesario tener en cuenta que no se puede realizar el retiro si el valor solicitado
 *   supera el saldo actual de la cuenta.
 **/

public class Cuentabancaria2 {

    String nombre_titular;
    String apellido_titular;
    Double numero_cuentaBancaria;
    String tipo_cuentaBancaria; //Puede ser cuenta ahorro o cuenta corriente
    Double saldo_cuentaBancaria = 0.0;

    public Cuentabancaria2(String nombre_titular, String apellido_titular, Double numero_cuentaBancaria, String tipo_cuentaBancaria, Double saldo_cuentaBancaria) {
        this.nombre_titular = nombre_titular;
        this.apellido_titular = apellido_titular;
        this.numero_cuentaBancaria = numero_cuentaBancaria;
        this.tipo_cuentaBancaria = tipo_cuentaBancaria;
        this.saldo_cuentaBancaria = saldo_cuentaBancaria;
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

    //Metodo para mostrar inforrmacion
    public void mostrarInformacion(){
        System.out.println("Nombre del titular: " + nombre_titular);
        System.out.println("Apellido del titular: " + apellido_titular);
        System.out.println("Numero de cuenta bancaria: " + numero_cuentaBancaria);
        System.out.println("Tipo de cuenta bancaria: " + tipo_cuentaBancaria);
        System.out.println("Saldo del cuenta: " + saldo_cuentaBancaria);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular: ");
        String nombre_titular = entrada.nextLine();
        System.out.println("Ingrese el apellido del titular: ");
        String apellido_titular = entrada.nextLine();
        System.out.println("Ingrese el numero de cuenta bancaria: ");
        Double numero_cuentaBancaria = entrada.nextDouble();
        System.out.println("Ingrese el tipo de cuenta bancaria (ahorro - corriente): ");
        String tipo_cuentaBancaria = entrada.nextLine();
        System.out.println("Ingrese el saldo del cuenta: ");
        Double saldo_cuentaBancaria = entrada.nextDouble();

        System.out.println("Desea consultar el saldo de su cuenta bancaria actualizado? ");
        String consulta_saldo;

        if(tipo_cuentaBancaria.equals("ahorro")) {
            System.out.println("El tipo de cuenta bancaria es ahorro");
        } else if (tipo_cuentaBancaria.equals("corriente")) {
            System.out.println("El tipo de cuenta bancaria es corriente");
        } else {
            System.out.println("Valor de tipo de cueunta incorrecto");
        }

    }




}
