package ConversorMetros;

public class Conversiones {
    private Integer unidad;
    private double valorConvertir;

    public Conversiones() {
    }

    public Conversiones(Integer unidad, double valorConvertir) {
        this.unidad = unidad;
        this.valorConvertir = valorConvertir;
    }

    public static double conversiones(Integer unidad, double valorConvertir){
        switch(unidad){
            case 1:
                return valorConvertir * 100;
            case 2:
                return valorConvertir * 1000;
            case 3:
                return valorConvertir * 39.3701;
            case 4:
                return valorConvertir * 3.28084;
            case 5:
                return valorConvertir * 1.0936;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    }
}
