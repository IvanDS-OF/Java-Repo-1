/*
Este codigo nos va a permitir hacer uso de nuestro teclado comoe 
entrada del usuario, para podder interactuar con el programa
Usualmente no es así, solo es un ejemplo de uso
Casi siempre es usado un UI para la interacción, xd
 */

// Importamos las librerias necesarias 
import java.util.Scanner; //Siempre poner  ;


public class IntroduccionCaracteresTeclado {
    //Comenzamos con el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Simplemente mandamos a llamar a la librería
        //Como si la inicializaramos 
        System.out.println("Ingresa tu nombre, plots XD"); //Colocamos un texto para solicitar informacion
        String nombre = scanner.nextLine(); // Es el comando para registrar lo que sigue de la linea anteror
        // basicamenet es el Input() 

        //Una vez sabido el nombre, podemos ya hacer uso de el, de la siguiem¿nte manera
        System.out.println("Hola: " + nombre + " Benvenuti, marico :D");

        //Continuando con el ejercicio, vamos a pedir la edad
        System.out.println("Ingresa tu edache, plots :D");
        int edad = scanner.nextInt();
        System.out.println("Tu edad registrada es: " + edad + " poderosos años ya xd");
        

    }
    
}
