import java.util.Scanner;

public class SentenciaWhile {
    public static void main(String[] args) {
        //Vamos a conocer más a detalle el funcionamiento de la sentencia While 

        Scanner scanner = new Scanner(System.in);

        //Colocamos nuestro mensaje de bienvenida
        System.out.println("Coloca un numero interesante alavoz");

        int Numero = scanner.nextInt();

        while (Numero != 5) {
            System.out.println("El numero actual es: " + Numero);
            Numero = Numero + 1;

        }

        System.out.println("Terminamos, Gracias. ");


        //Vmoas a hacer uso del ciclo Do While
        //La diferencia está en que es necesactio primero correr una vez la logica 
        // ¿dentro de la sentencia y luego se hace la validacion de la sentencia. 
        
        // Vamos a solicitar al usuario escribir un numero, y el cliclo terminara hasta que sea 0

        System.out.println("Por favor escribe un numero xd");

        int RespuestaCero = scanner.nextInt();

        int NumeroCero = 0;

        do {
            System.out.println("Estas dentro del bucle");
            System.out.println("Tu numero no es valido para salir   ");
            //Es necesario colocar una entrada aqui
            RespuestaCero = scanner.nextInt();

        } while (RespuestaCero != 0);
        System.out.println("Has salido del bucle nene. ");



    }
}
