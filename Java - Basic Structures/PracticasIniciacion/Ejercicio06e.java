package PracticasIniciacion;

import java.util.Scanner;

public class Ejercicio06e {

    //Declaraton of my constatn
    private static final String MAGIC_WORD = "AyudaDios";
    public static void main(String[] args) {
        //We need to use the sentence Do While and the Scanner library

        //Ask for "AyudaDsio" with a loop and finish the program until the user
        //types exactly that word

        //Creation of a new Scanner object
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        String response = "";

        do {
            
            System.out.println("Por favor, escribe el texto AyudaDios ");
            response = scanner.nextLine();
            System.out.println("Your asnwer was: " + response + "And it should be  the next one " + MAGIC_WORD);
            System.out.println("Hash Response : " + response.hashCode() + " And my WORD is " + MAGIC_WORD.hashCode());

        } while (!response.equals(MAGIC_WORD));
        // while (response.hashCode() != MAGIC_WORD.hashCode());

        System.out.println("Super padresanto, fuga");



    }
}
