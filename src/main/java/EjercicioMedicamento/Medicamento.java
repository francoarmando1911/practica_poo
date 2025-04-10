package EjercicioMedicamento;

/*
Se requiere desarrollar un programa que modele la siguiente información
de un medicamento:
u Nombre del medicamento.
u Fabricante del medicamento.
u Vía de administración del medicamento.
La clase medicamento debe tener una clase interna, que represente la
posología del medicamento con la siguiente información:
u Usuarios del medicamento.
u Dosis del medicamento en miligramos
u Periodo de tiempo para tomar el medicamento.
u Recomendaciones.
 */
public class Medicamento {
    private String nombreMedicamento;
    private String fabricanteMedicamento;
    private String viaAdministracionMedicamento;

    private class PsicologiaMedicamento {
        private String usuarios;
        private double dosisMiligramos;
        private String periodoTiempo;
        private String recomendaciones;

        public PsicologiaMedicamento(String usuarios, double dosisMiligramos, String periodoTiempo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosisMiligramos = dosisMiligramos;
            this.periodoTiempo = periodoTiempo;
            this.recomendaciones = recomendaciones;
        }
    }
}
