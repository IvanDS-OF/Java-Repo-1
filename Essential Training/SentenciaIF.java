import java.util.Scanner;

public class SentenciaIF {
    public static void main(String[] args) {
        //Vamos a ver còmo funciona la Sentencia If 
        //Mandamos a llamar a nuestro Scanner 
        Scanner scanner = new Scanner(System.in);
        
        //Vamos a hacer que el usuario adivim¡ne nun numero
        int NumeroAdivinar = 5;

        //Mostramos mensaje:
        System.out.println("Adivina el numero pensado nene");

        int Respuesta = scanner.nextInt();

        //Generamos las condicionalse simples
        if (Respuesta == NumeroAdivinar) {
            System.out.println("Ah prro, eres sabio");            
        } else {
            System.out.println("Nel padresanto, uste no le sabe");
        }



        //De igual forma es posible Hacer uso de la sentencia ElseIF 
        //De la siguiente manera

        System.out.println("Ahora escriba un numero XD");
        int OtroNumero = scanner.nextInt();
        
        if (OtroNumero < NumeroAdivinar) {
            System.out.println("Tu numero es MENOR al numero a aadivinar");
        } else if (OtroNumero > NumeroAdivinar) {
            System.out.println("Tu numero es MAYOR al numero a adivinar");
        } else {
            System.out.println("Tu numero es el CORREPTO NENE");
        }




    }
}
