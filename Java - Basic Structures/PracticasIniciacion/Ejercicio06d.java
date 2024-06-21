package PracticasIniciacion;

public class Ejercicio06d {
    private static final int LIM = 10;

    public static void main(String[] args) {
        //Exercise: Show the first argument that will be a long word (more than 10 characters)
        //The x word is huge, 
        //if not, show "All is correct, bye"

        int i = 0;
        
        while (i < args.length) {
            
            String s = args[i];

            if (s.length() > LIM) {
                System.out.println("The word " + args[i] + "is very huge :D");
                break;
            }

            if (i == args.length -1 ) {
                System.out.println("All is ok, bye");
                break;
            }

            i++;

            //System.out.println("This is my current position: " + i);

        }








    }

}
