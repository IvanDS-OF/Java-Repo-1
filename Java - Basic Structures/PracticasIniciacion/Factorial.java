package PracticasIniciacion;

public class Factorial {
    public static void main(String[] args) {
        
        //Lets to use the While sentence to obtain the factorial of the argument
        int number = Integer.valueOf(args[0]);
        System.out.println(number);
        int res = 1;
        int i = number; //Starting the increment
        boolean condition = i < 0;

        System.out.println("Initializating my i: " + i);
        System.out.println("Result initial value: " + res);
        System.out.println("Condition of my While sentence: " + condition);
        
        while (i > 0) {
            //While I is higer than 0, do the actions inside
            res = res * i;
            i = i - 1;
            //System.out.println(res);
            //System.out.println(i);
        }

        System.out.println("The result is: " + res);


    }
}
