import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProyectoConversorModedas {
    public static void main(String[] args) {
        //El programa tiene que ser capaz de trasnformar de Euros a Dolarukos 
        //Recordar colocar esto dentro de Git :D

        //Inicializamos la libreria Scanner para solicitar el input del usuario
        Scanner scanner = new Scanner(System.in); //Recordar el Punto y Coma 

        //Definimos las variables de entrada y salida así como sus tipos
        //y procesos matematicos sencillos e inventados para tema de ejemplo

        //Mostramos los mensajes para el usuario
        System.out.println("Buen día. Bienvenido al banco Central");
        System.out.println("El precio del Dolar es de 0.95 Euros.");
        System.out.println("Cuándos euros cambiará hoy ? ");

        Double UserResponse = scanner.nextDouble();

        Double FinalResult = UserResponse * 0.95;

        System.out.println("Ahora cuenta con " + (double)FinalResult + " Dolares en su cuenta. Gracias");

        //Inicialmente la respuesta como está anteriormente mostrada regresa un error en la salida. ya que devuelve muchos 
        //Decimales lo cual realmente es un problema hablando de dinero. 

        //Hay muchos método, el recomendado por el curso es mediante el uso de BigDecimal y el método Multiply. 
        //Pero usaremos la siguiente forma más sencilla xd

        //Creamos una nueva variable con el tipo DecimalFormat
        DecimalFormat NewFormatMethod = new DecimalFormat("#.###"); //Inicializamos la libreria y colocamos en el argumento 
        // El nuevo formato deseado, es similar a VBA, o C.

        //Ahora vamos a crear nuestra variable haciendo uso del método .format de la libreria creada anteriormente
        String FinalResultFormatted = NewFormatMethod.format(FinalResult);

        //Now we should have the correct format, lets see. 
        System.out.println("Resultado Final Final: = " + FinalResultFormatted);
        

        String A = String.format("%.3f", FinalResult);

        System.out.println(A);

    }
}
