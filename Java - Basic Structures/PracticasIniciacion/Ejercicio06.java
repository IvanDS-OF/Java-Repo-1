package PracticasIniciacion;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Lets to create a program to ask a specific quantity of number in the arguments
        //Usinf the If sentence and the use of Constants

        final int NUM_MAX_ARGS = 4;

        //First we need to read the quantity on numbers
        int number = Integer.valueOf(args.length);


        //Put the conditions
        if (number >  NUM_MAX_ARGS) {
            System.out.println("Hay muchos valores mano");
        } else if (number == NUM_MAX_ARGS) { //Remember the Sentence IF Else
            System.out.println("Los argumentos son 4");
        } else {
            System.out.println("Los valores son menos a 4");
        }


        //The magic numbers are those that are inside of the code 
        //It is a incorrect practice, to solve this we sould replace them
        //with CONSTRANTS


    }

}
