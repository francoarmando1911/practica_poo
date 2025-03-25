package Ejercicios;
/*
Se requiere modificar el programa de la cuenta bancaria (ejercicio 2.5) para que realice las
siguientes actividades:
-  Comparar saldos entre cuentas bancarias. La cuenta para comparar es un objeto que se envía como
parámetro del método. El método devuelve un valor booleano de verdadero si la cuenta actual es
mayor o igual a la cuenta que se pasó como parámetro.
- Transferir dinero de una cuenta bancaria a otra. El método debe recibir como parámetro la cuenta
de destino y el valor a transferir. El saldo de la cuenta actual debe disminuir el valor a transferir
y el saldo de la cuenta destino debe aumentar. El método debe reutilizar el metodo retirar para
evaluar si la cantidad a transferir se encuentra en la cuenta de origen.
*/

public class Cuentabancaria3 {

    String nombre_titular;
    String apellido_titular;
    Double numero_cuentaBancaria;
    String tipo_cuentaBancaria;
    Double saldo_cuentaBancaria = 0.0;

    public Cuentabancaria3(String nombre_titular, String apellido_titular, Double numero_cuentaBancaria, String tipo_cuentaBancaria, Double saldo_cuentaBancaria) {
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

    public Double getNumero_cuentaBancaria() {
        return numero_cuentaBancaria;
    }

    public void setNumero_cuentaBancaria(Double numero_cuentaBancaria) {
        this.numero_cuentaBancaria = numero_cuentaBancaria;
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

    public void mostrarInformacion(){
        System.out.println("Nombre del titular: " + nombre_titular);
        System.out.println("Apellido del titular: " + apellido_titular);
        System.out.println("Numero de cuenta bancaria: " + numero_cuentaBancaria);
        System.out.println("Tipo de cuenta bancaria: " + tipo_cuentaBancaria);
        System.out.println("Saldo del cuenta: " + saldo_cuentaBancaria);
    }

    public double consultarSaldo(){
        return saldo_cuentaBancaria;
    }

    public boolean compararSaldos(Cuentabancaria3 cuenta){
        if(this.saldo_cuentaBancaria >= cuenta.saldo_cuentaBancaria){
            return true;
        }else{
            return false;
        }
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
        Cuentabancaria3 cuenta1 = new Cuentabancaria3("Juan", "Perez", 1234567890.0, "Ahorros", 100000.0);
        Cuentabancaria3 cuenta2 = new Cuentabancaria3("Maria", "Gomez", 1234567891.0, "Corriente", 50000.0);
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        System.out.println("Comparar saldos: " + cuenta1.compararSaldos(cuenta2));
        cuenta1.consignarSaldo(50000);
        cuenta1.retirarSaldo(20000);
        cuenta1.retirarSaldo(100000);
        cuenta1.compararSaldos(cuenta2);
    }
}
