package PracticasIniciacion;

public class Ejercicio03 {
    //Vamos a ver cómo podemos hacer uso de los argumentos, de los args 
    public static void main(String[] args) {
        //Recordar que los args se pueden usar cuando tenermos nuestra clase main

        //Los args con como vectores, como listas, y podemos accedera ellos con los indices
        //Lets to do a script that read the 2 int arguments and multuply them to know the value

        //The way to read this args is different, because we ate not using the Scanner library

        int ladoA = Integer.valueOf(args[0]);

        int ladoB = Integer.valueOf(args[1]);

        //Ahora vamos a hacer la operacion principal

        int resultado = ladoA * ladoB;

        System.out.println("El valor de la multiplicacion entre " + args[0] + 
        " y el valor " + args[1] + " es de: " + resultado );






    }
}
