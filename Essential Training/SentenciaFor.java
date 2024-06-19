import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {
        //Los bucles For nos ayudan a iterar un determinado numero de veces algo

        Scanner scanner = new Scanner(System.in);
        //Colocamos un mensaje de bienvenida :D
        System.out.println("Instroduzca el valor 1");

        int PrimerNumero = scanner.nextInt();

        System.out.println("Ahora escria el segundo numero");
        int SegundoNumero = scanner.nextInt();

        //Vamos a hacer la multiplicacion de los dos anteriore numero con el metodo de suma
        int Resultado = 0;
        //Creamos la variable a iterar dentro del For como en Arduino 
        for (int i = 0; i < SegundoNumero; i++) {
            //Colocamos visualmente la iteracion en donde vamos: 
            System.out.println("Iteracion numero: " + i);
            //Hacemos la operacion matematica
            Resultado = Resultado + PrimerNumero;
            System.out.println("El resultado actual es: " + Resultado);
        }

        System.out.println("Finalmente el resultado de la operacion es: " + Resultado);







    }
}
