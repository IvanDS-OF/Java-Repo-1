package PracticasIniciacion;

public class Ejemplo07 {
    public static void main(String[] args) {
        //Lets to know the for each loop

        /* 
        for (String string : args) {
            System.out.println(string);
        }
         */
        //The visual difference between the clasic FOR and the FOR EACH is the colon (;)
 

        //Lets to do an example using this new features
        //Print all the arguments received, If the argument has less than  characters
        //write it in Uppercase, if not, in LowerCase
        final int QUANT_ARGS = 5;
        int argsString = args.length;
        
        System.out.println(argsString);
        if (argsString < QUANT_ARGS) {
            for (String s : args) {
                System.out.println(s.toUpperCase());
            }
        } else {
            for (String s : args){
                System.out.println(s.toLowerCase());
            }
        }






    }
}
