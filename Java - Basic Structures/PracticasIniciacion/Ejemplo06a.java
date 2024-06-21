package PracticasIniciacion;

public class Ejemplo06a {
    public static void main(String[] args) {
        //List all the arguments received but with the index of its position
        //We need to iterations, one fot showing the argument and other for 
        //count the index
        //first the index one
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ") " + args[i]);
        }
        //xd


        //Inside the FOREACH sentences is a bad practice to have an increment variable 
        //if it is necessary, it is recommended to implement a Classic FOR

    }
}
