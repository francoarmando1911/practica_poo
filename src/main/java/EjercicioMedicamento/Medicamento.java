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

    public Medicamento(String nombreMedicamento, String fabricanteMedicamento, String viaAdministracionMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
        this.fabricanteMedicamento = fabricanteMedicamento;
        this.viaAdministracionMedicamento = viaAdministracionMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getFabricanteMedicamento() {
        return fabricanteMedicamento;
    }

    public void setFabricanteMedicamento(String fabricanteMedicamento) {
        this.fabricanteMedicamento = fabricanteMedicamento;
    }

    public String getViaAdministracionMedicamento() {
        return viaAdministracionMedicamento;
    }

    public void setViaAdministracionMedicamento(String viaAdministracionMedicamento) {
        this.viaAdministracionMedicamento = viaAdministracionMedicamento;
    }

    class PsicologiaMedicamento {
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

        public String getUsuarios() {
            return usuarios;
        }

        public void setUsuarios(String usuarios) {
            this.usuarios = usuarios;
        }

        public double getDosisMiligramos() {
            return dosisMiligramos;
        }

        public void setDosisMiligramos(double dosisMiligramos) {
            this.dosisMiligramos = dosisMiligramos;
        }

        public String getPeriodoTiempo() {
            return periodoTiempo;
        }

        public void setPeriodoTiempo(String periodoTiempo) {
            this.periodoTiempo = periodoTiempo;
        }

        public String getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(String recomendaciones) {
            this.recomendaciones = recomendaciones;
        }
    }
}
