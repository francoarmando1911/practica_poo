package Ejercicios;

/**
 * Se requiere un programa que modele el concepto de un automóvil.
 * Un automóvil tiene los siguientes atributos:
 * - Marca: el nombre del fabricante.
 * - Modelo: año de fabricación.
 * - Motor: volumen en litros del cilindraje del motor de un automóvil.
 * - Tipo de combustible: valor enumerado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.
 * - Tipo de automóvil: valor enumerado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
 * - Número de puertas: cantidad de puertas.
 * - Cantidad de asientos: número de asientos disponibles que tiene el vehículo.
 * - Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.
 * - Color: valor enumerado con los posibles valores de blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.
 * - Velocidad actual: velocidad del vehículo en un momento dado.
 *
 * La clase debe incluir los siguientes métodos:
 * - Un constructor para la clase Automóvil donde se le pasen como parámetros los valores de sus atributos.
 * - Métodos get y set para la clase Automóvil.
 * - Métodos para acelerar una cierta velocidad, desacelerar y frenar (colocar la velocidad actual en cero).
 *   Es importante tener en cuenta que no se debe acelerar más allá de la velocidad máxima permitida para el automóvil.
 *   De igual manera, tampoco es posible desacelerar a una velocidad negativa. Si se cumplen estos casos,
 *   se debe mostrar por pantalla los mensajes correspondientes.
 * - Un método para calcular el tiempo estimado de llegada, utilizando como parámetro la distancia a recorrer en kilómetros.
 *   El tiempo estimado se calcula como el cociente entre la distancia a recorrer y la velocidad actual.
 * - Un método para mostrar los valores de los atributos de un Automóvil en pantalla.
 * - Un método main donde se deben crear un automóvil, colocar su velocidad actual en 100 km/h,
 *   aumentar su velocidad en 20 km/h, luego decrementar su velocidad en 50 km/h, y después frenar.
 *   Con cada cambio de velocidad, se debe mostrar en pantalla la velocidad actual.
 */

public class Automovil {
    private String marca;
    private int anioFab = 0;
    private float vol_lit_motor = 0;

    public enum TipoCombustible {
        GASOLINA,
        BIOETANOL,
        DIESEL,
        GASNATURAL
    }

    public enum TipoAutomovil{
        CIUDAD,
        SUBCOMPACTO,
        COMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    private int num_asientos = 0;
    private int num_puertas = 0;
    private float vel_maxima = 0;

    public enum Color{
        BLANCO,
        NEGRO,
        ROJO,
        NARANJA,
        AMARILLO,
        VERDE,
        AZUL,
        VIOLETA
    }

    private float velocidad_actual = 0;

    public Automovil(String marca, int anioFab, float vol_lit_motor, int num_asientos, int num_puertas, float vel_maxima, float velocidad_actual) {
        this.marca = marca;
        this.anioFab = anioFab;
        this.vol_lit_motor = vol_lit_motor;
        this.num_asientos = num_asientos;
        this.num_puertas = num_puertas;
        this.vel_maxima = vel_maxima;
        this.velocidad_actual = velocidad_actual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    public float getVol_lit_motor() {
        return vol_lit_motor;
    }

    public void setVol_lit_motor(float vol_lit_motor) {
        this.vol_lit_motor = vol_lit_motor;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public float getVel_maxima() {
        return vel_maxima;
    }

    public void setVel_maxima(float vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public float getVelocidad_actual() {
        return velocidad_actual;
    }

    public void setVelocidad_actual(float velocidad_actual) {
        this.velocidad_actual = velocidad_actual;
    }

    /*
     Métodos para acelerar una cierta velocidad, desacelerar y frenar (colocar la velocidad actual en cero).
     *   Es importante tener en cuenta que no se debe acelerar más allá de la velocidad máxima permitida para el automóvil.
     *   De igual manera, tampoco es posible desacelerar a una velocidad negativa. Si se cumplen estos casos,
     *   se debe mostrar por pantalla los mensajes correspondientes.
     */




}
