package PracticasIniciacion;

public class Ejercicio06b { 
    //Declare all my variables
    private static final int LIM = 5;
    public static void main(String[] args) {
        //Enumarate all the arguments received and if the word has less tha 5 characters
        //print it 5 times, if the number of characters is more than 5, just print it 2 times

        for (int i = 0; i < args.length; i++) {
            String s = args[i]; //Enumerate the argument
            if (s.length() < LIM) {
                System.out.print(i + ") " );
                for (int j = 0 ; j < LIM ; j++){
                    System.out.print(s + " ");
                }
                System.out.print("\n");
            } else {
                System.out.print(i + ") ");
                for (int j = 0 ; j < LIM-3 ; j++){
                    System.out.print(s + " ");
                }
                System.out.print("\n");
            }

        }
    }

    private static String fiveTimes(String value){
        //return value + " " + value + " " + value + " " + value + " " + value;
        //We should use an elegant way to iterate the previous code. 
        for (int i = 0 ; i < LIM ; i++){
            //return value;
        }
        return "A";
    }

    private static String twoTimes(String value){
        return value + " " + value;
    }

}
