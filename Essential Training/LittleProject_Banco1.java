import java.util.Scanner;

public class LittleProject_Banco1 {
    public static void main(String[] args)  {  //RECORDAR, Siempre colocar esto para comenzar la clase main
        Scanner scanner = new Scanner(System.in); //Inicializamos la librería dentro de nuestra clase
        
        //Comenzamos a ofrecer opciones 
        System.out.println("Cosa vuo fare oggi ? ");
        System.out.println("    1: Avere una matita");
        System.out.println("    2: Avere una birra");
        
        int Respuesta = scanner.nextInt();

        System.out.println("La sua risposta che ha scelto e il numero: " + Respuesta + " Grazie.");
        System.out.println("Finito, bai");


    }
}
