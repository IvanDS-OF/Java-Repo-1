import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ReadFilesTXT {
    public static void main(String[] args) {
        //Aprenderemos a leer archivos TXT desde y a mostrarlos en pantalla, así como modificarlos. 
        //Primero recordar que es necesario tener un archivo .txt en nuestra carpeta

        //Definimos nuestro path
        Path inputPath = Paths.get("C:\\Users\\ivan_\\OneDrive\\Documentos\\Java Scripts\\Java Essential\\Arrays\\archivo.txt");
        InputStream input; //Definimos niestra entrada
        
        //De manera inicial colocamos nuestro comando, per despues lo encerramos en un Try-Catch
        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ); //Con esto podemos ya leer un archivo. 
            int i; //Inicializamos nuna variable para que sea nuestro puntero de lectura: 
            while ((i = input.read()) != -1) {
                System.out.print((char)i); //Recordar cambiar el *printnl por el correcto que es *print
                //Ya que el Println significa que despues de cada encuentro va a dar un salto de linea. 
                //Es necesario hacer la conversion a Chaar a nuestra variale iterable i


            }  
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }





        /***************************************************** */
        //Para hacer la escritura de en el mismo archivo, lo podemos hacer de la siguiente manera
        //Generamos el archiov en donde vamos aescribir - CON OTRO NOMBRE
        Path outputPath = Paths.get("C:\\Users\\ivan_\\OneDrive\\Documentos\\Java Scripts\\Java Essential\\Arrays\\archivo2.txt");

        try {
            //Dentro de esta sentencia colocamos lo necesario para hacer la consulta 

            InputStream InputStream = Files.newInputStream(inputPath, StandardOpenOption.READ); //Primero leemos
            
            Files.newOutputStream(outputPath, StandardOpenOption.CREATE); //Ahora creamos el nuevo archivo. 
            //Este nuevo documento tiene que estar ya inicializado. 

            //Ahora vamos a inicializar el archivo creado empero en modo escritura; 
            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

            //Vamos a crear un nuevo espacio para guardar lo que el archivo 1 tiene y sopiarlo al archivo 2
            int j;

            byte[] data = new byte[1024];
            while ((j = InputStream.read(data)) != -1)  {
                outputStream.write(data);                
            } 


            //Cuando terminamos de trabajar con los archivos es necesario cerrarlos
            //Para mejor practicas
            InputStream.close();
            outputStream.close();

        } catch (Exception e) {
            // TODO: handle exception
        }











    }
}
