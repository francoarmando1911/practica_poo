package EjercicioAtleta;

/**
Realizar un programa en Java que permita modelar un atleta, el cual tiene
los siguientes atributos de instancia:
u Identificador del atleta de tipo int.
u Nombre del atleta de tipo String.
u Tiempo en realizar una prueba de 400 metros por relevos, de tipo
double.
Además, se tienen los siguientes atributos estáticos:
u Un contador con la cantidad de atletas creados, el cual servirá
como identificador de un atleta.
u Un atributo estático denominado selección de tipo String con el
valor “Colombia”.
u Un atributo estático denominado tiempoEquipo que sume los valo-
res de tiempo obtenidos por un equipo de atletas.
Es necesario crear un constructor para la clase con los parámetros:
nombre y tiempo de cada atleta. En el constructor se debe inicializar el iden-
tificador del atleta con base en el contador estático.
También se deben implementar los siguientes métodos:
u Correr 400 metros: este método actualiza el tiempo total de carrera
del equipo sumando el tiempo de carrera de cada atleta.
u Un método estático que imprima el nombre de la selección de
atletismo, el cual es un atributo estático.
u Un método estático que imprima el tiempo total obtenido por el
equipo de atletismo.
u Un método main que debe crear cuatro atletas que conforman el
equipo de relevos de 400 metros, con los valores de la tabla 3.1.
 **/
public class MainAtleta {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Alejandro Perlaza",9.55);
        atleta1.correr400metros();
        Atleta atleta2 = new Atleta("Anthony Zambrano",9.28);
        atleta1.correr400metros();
        Atleta atleta3 = new Atleta("Diego Palomeque",9.53);
        atleta1.correr400metros();
        Atleta atleta4 = new Atleta("Gilmar Herrera",9.29);
        atleta1.correr400metros();
        Atleta.imprimirSelección();
        atleta1.imprimir();
        atleta2.imprimir();
        atleta3.imprimir();
        atleta4.imprimir();
        Atleta.imprimirTiempoEquipo();
    }
}
