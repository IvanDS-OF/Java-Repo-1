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

    }
}
