import java.util.Scanner;

public class KeyGenerator {
    //Place the constants
    private static final String CONTINUAR = "N";

    private static final String CONSONANTES = "BCDFGHJKLMNPQRSTVWXYZ";
    private static final String VOCALES = "aeiou";
    private static final String NUMEROS = "1234567890";
    private static final String SIMBOLOS = "@#$%&()";

    private static final int NUM_PARES = 3; 
    private static final int NUM_NUMS = 2;
    private static final int NUM_SIMB = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";
        String password = "";


        
        do {
            System.out.println("La contraseña propuesta es, ");

            for (int i = 0; i < NUM_PARES; i++) {
                password = password + generaPar();
            }
            for (int i = 0; i < NUM_NUMS; i++) {
                password = password + generarNum();
            }
            for (int i = 0; i < NUM_SIMB; i++) {
                password = password + generarSimb();
            }


            System.out.println(password);

            System.out.println("Si no le gusta presione \"n\"");
            response = scanner.nextLine();

            password = "";
            
        } while (!response.equalsIgnoreCase(CONTINUAR));

        System.out.println("Gracias por hacer uso de nuestro servicio, bai");
    }


    //Lets to generate an interlan method to choose randomly a character from out Constatnts

    public static char choseRandomly (String constant){
        //Returns a random value from the argument
        int pos = (int)(Math.random() * constant.length()); //Remember to transform it into Integer
        return constant.charAt(pos);
    }

    public static String generaPar(){
        String par = "";
        par = par + choseRandomly(CONSONANTES);
        par = par + choseRandomly(VOCALES);
        return par;
    }

    public static String generarNum(){
        String num = "";
        num = num + choseRandomly(NUMEROS);
        return num;
    }

    public static String generarSimb(){
        String simbol = "";
        simbol = simbol + choseRandomly(SIMBOLOS);
        return simbol;
    }


}
