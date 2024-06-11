import java.util.Scanner;

public class UsoDeTiposDeVariables {
    public static void main(String[] args) {
        //Vamos a ver que Ahora en Java es posible no tipar de forma explicata a nuestras variables
        //Y podemos haer usod e la palabra Var para que se o¿pueda definir sin errores

        var numero = 3.3; //Recordar colocar Punto y Coma
        var palabra = "Arigato";

        //Ahora mostramos el tipo de variablq eu es detectado :
        //Aspi es como podemos obtener el tipo de variable de una variable xd
        System.out.println("La palabra es de un tipo: " + palabra.getClass().getSimpleName());

        //Una ventaja interesante es que la variable se va a casar con el tipo de dato incialmente reconocido.
        
        //De igual manera e posible hacer uso de Var a la hora de crear un objeto
        var scanner = new Scanner(System.in);

        System.out.println("as");

        var UserResponse = scanner.nextInt();

        


    }
}
