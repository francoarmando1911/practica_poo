package Ejercicios;

/*
Crear una clase Empleado con atributos nombre y salario, y un método calcularSalario. Luego, crear
una clase EmpleadoPorHora que herede de Empleado y sobrescriba el método calcularSalario para calcular el
salario en función de las horas trabajadas y la tarifa por hora.
 */

public class EmpleadoPolimorfismo {

    private String nombre;
    private double salario;

    public EmpleadoPolimorfismo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular el salario
    public double calcularSalario(){
        return salario;
    }
}

class EmpleadoPorHora extends EmpleadoPolimorfismo {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaHora) {
        super(nombre, 0); // No se necesita un salario fijo, se calcula con horas y tarifa
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario(){
        return horasTrabajadas * tarifaHora;
    }
}

class Main1 {
    public static void main(String[] args) {
        EmpleadoPolimorfismo empleadoFijo = new EmpleadoPolimorfismo("Franco Armando", 50000);
        System.out.println("Salario del empleado fijo: " + empleadoFijo.calcularSalario());

        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Franco", 45, 500);
        System.out.println("Salario del empleado por hora: " + empleadoPorHora.calcularSalario());
    }
}
