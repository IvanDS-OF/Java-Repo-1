package PracticasIniciacion;

public class Factorial {
    public static void main(String[] args) {
        
        //Lets to use the While sentence to obtain the factorial of the argument
        int number = Integer.valueOf(args[0]);
        System.out.println(number);
        int res = 1;
        int i = 0; //Starting the increment
        
        while (i < 0) {
            //While I is higer than 0, do the actions inside
            res = res * number;
            i = i - 1;
            System.out.println(res);
            System.out.println(i);
        }

        System.out.println("The result is: " + res);


    }
}
