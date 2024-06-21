package PracticasIniciacion;

public class Ejercicio06e1 {

    private static final String FIN = "fin";
    public static void main(String[] args) {

        System.out.println("Se han recibido "+ args.length + " argumentos. ");
        
        //Lets to know the sentence Do while. 
        //It is a loop, but the actions within the loop will execute at leat one time

        int i = 0; //Init of my while loop
        do {
            System.out.println(i + ") " + args[i]);
            i++; // Remember to increase the while variable.
        } while (!args[i].equals(FIN) && i < args.length);

        System.out.println("FIN estaba en la posicion no " + i);



    }
}
