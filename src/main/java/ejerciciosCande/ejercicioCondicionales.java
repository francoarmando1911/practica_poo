package ejerciciosCande;

/*
Si pasa (condicion){
    se ejecuta codigo
} sino {
    se ejecuta codigo
}

Si Persona tiene mas de 18 años, puede entrar, sino, dar mensaje de que es menor.
 */
public class ejercicioCondicionales {
    public static void main(String[] args) {

        //Condicionales

        int edadPersona = 10;

        //Si  se cumple (condicion){
        //  se ejecuta codigo
        // } Sino se cumple{
        //  se ejecuta opcion de que no se cumple
        // }
        if(edadPersona >= 18){
            System.out.println("La persona puede pasar");
        } else {
            System.out.println("La persona no puede pasar es menor de edad");
        }
    }
}
