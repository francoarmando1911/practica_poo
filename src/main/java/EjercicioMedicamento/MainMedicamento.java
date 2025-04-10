package EjercicioMedicamento;

/*
En un método main se debe crear el medicamento. También se debe
crear una posología y asignársela al medicamento creado. Se deben mostrar
en pantalla los datos del medicamento y de su posología.
 */

public class   MainMedicamento {
    public static void main(String[] args) {

        Medicamento medicamento = new Medicamento();
        medicamento.setNombreMedicamento("Paracetamol");
        medicamento.setFabricanteMedicamento("Laboratorios XYZ");
        medicamento.setViaAdministracionMedicamento("Oral");

        Medicamento.PsicologiaMedicamento posologia = medicamento.new PsicologiaMedicamento(
                "Adultos", 500, "Cada 8 horas", "Tomar con agua"
        );

        // Mostrar los datos del medicamento
        System.out.println("Medicamento:");
        System.out.println("Nombre: " + medicamento.getNombreMedicamento());
        System.out.println("Fabricante: " + medicamento.getFabricanteMedicamento());
        System.out.println("Vía de administración: " + medicamento.getViaAdministracionMedicamento());

        // Mostrar los datos de la posología
        System.out.println("\nPosología:");
        System.out.println("Usuarios: " + posologia.getUsuarios());
        System.out.println("Dosis: " + posologia.getDosisMiligramos() + " mg");
        System.out.println("Periodo: " + posologia.getPeriodoTiempo());
        System.out.println("Recomendaciones: " + posologia.getRecomendaciones());
    }
}
