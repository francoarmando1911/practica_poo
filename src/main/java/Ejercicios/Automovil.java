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
        private int anioFab;
        private float volLitMotor;
        public enum TipoCombustible {
            GASOLINA,
            BIOETANOL,
            DIESEL,
            BIODIESEL,
            GASNATURAL
        }
        public enum TipoAutomovil {
            CIUDAD,
            SUBCOMPACTO,
            COMPACTO,
            FAMILIAR,
            EJECUTIVO,
            SUV
        }
        private int numAsientos;
        private int numPuertas;
        private float velMaxima;
        private float velocidadActual;
        public enum Color {
            BLANCO,
            NEGRO,
            ROJO,
            NARANJA,
            AMARILLO,
            VERDE,
            AZUL,
            VIOLETA
        }
        public Automovil(String marca, int anioFab, float volLitMotor, int numAsientos, int numPuertas, float velMaxima) {
            this.marca = marca;
            this.anioFab = anioFab;
            this.volLitMotor = volLitMotor;
            this.numAsientos = numAsientos;
            this.numPuertas = numPuertas;
            this.velMaxima = velMaxima;
            this.velocidadActual = 0;
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
        public float getVolLitMotor() {
            return volLitMotor;
        }
        public void setVolLitMotor(float volLitMotor) {
            this.volLitMotor = volLitMotor;
        }
        public int getNumAsientos() {
            return numAsientos;
        }
        public void setNumAsientos(int numAsientos) {
            this.numAsientos = numAsientos;
        }
        public int getNumPuertas() {
            return numPuertas;
        }
        public void setNumPuertas(int numPuertas) {
            this.numPuertas = numPuertas;
        }
        public float getVelMaxima() {
            return velMaxima;
        }
        public void setVelMaxima(float velMaxima) {
            this.velMaxima = velMaxima;
        }
        public float getVelocidadActual() {
            return velocidadActual;
        }
        public void setVelocidadActual(float velocidadActual) {
            this.velocidadActual = velocidadActual;
        }
        // Métodos para acelerar, desacelerar y frenar
        public void acelerar(float incremento) {
            if (velocidadActual + incremento > velMaxima) {
                System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velMaxima + " km/h.");
                velocidadActual = velMaxima;
            } else {
                velocidadActual += incremento;
            }
            System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");
        }
        public void desacelerar(float decremento) {
            if (velocidadActual - decremento < 0) {
                System.out.println("No se puede desacelerar a una velocidad negativa.");
                velocidadActual = 0;
            } else {
                velocidadActual -= decremento;
            }
            System.out.println("La velocidad actual es: " + velocidadActual + " km/h.");
        }
        public void frenar() {
            velocidadActual = 0;
            System.out.println("El vehículo ha frenado. Velocidad actual: " + velocidadActual + " km/h.");
        }
        // Método para calcular el tiempo estimado de llegada
        public float tiempoEstimadoLlegada(float distancia) {
            if (velocidadActual == 0) {
                System.out.println("El vehículo está detenido. No se puede calcular el tiempo estimado de llegada.");
                return Float.POSITIVE_INFINITY;
            }
            return distancia / velocidadActual;
        }
        // Método para mostrar los atributos del automóvil
        public void mostrarDatos() {
            System.out.println("Marca: " + marca);
            System.out.println("Año de fabricación: " + anioFab);
            System.out.println("Volumen del motor: " + volLitMotor + " litros");
            System.out.println("Número de asientos: " + numAsientos);
            System.out.println("Número de puertas: " + numPuertas);
            System.out.println("Velocidad máxima: " + velMaxima + " km/h");
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
        public static void main(String[] args) {
            Automovil auto = new Automovil("Toyota", 2020,1.8f, 5, 4, 180);
            auto.setVelocidadActual(100);
            auto.acelerar(20);
            auto.desacelerar(50);
            auto.frenar(); // Frenar
            auto.mostrarDatos(); // Mostrar los atributos del automóvil
        }
    }

