import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
        //Los arrays simples tienen un tema, y es que es necesario definir su estructura desde un inicio
        //Para ello podemos hacer uso de los ArrayList que nos permiten modificar su longitud
        //de forma dinamica

        //Para hacer la definicion de un ArrayList es de la siguiente manera
        ArrayList<String> listaDeCompras = new ArrayList<String>();
        //Siepre es necesario indicar el tipode elementos que va a contener
        //Para añadir nuevos elementos a nuestra lista, lo podemos hacer usando el Metodo .add, como en Python.
        listaDeCompras.add("UNO");
        listaDeCompras.add("Jaboncito");


        //Mostramos en la terminal los valores contenidos: 
        System.out.println("Mi lista es: " + listaDeCompras);
        //A la salida mostrará los valores así [UNO, Jabocito], con los brackets

        //Para acceder a un valor dentro de nuestra ArrayList, lo podemos hacer de la siguiente manera
        System.out.println("El primer elementos de mi primer lista es: " + listaDeCompras.get(0));
        //Es necesario hacer uso del metodo Get para obtener un valor de mi lista

        //Para modificar un elemento en especifico de nuestra lista de elmentos necesitamos hacer uso de .set
        listaDeCompras.set(0, "Tomate");
        //Mostramos nuevamente en pantalla
        System.out.println("Mi lista ahora es: " + listaDeCompras);


        //Para eliminar elementos d euna lista, lo podemos hacer con el metodo .remove
        listaDeCompras.remove(0);
        //Mostramos nuevamente
        System.out.println("Mi lista ahora es: " + listaDeCompras);
        //La remocion de elementos puede ser po indice o por equivalencia: 
        //listaDeCompras.remove("Jaboncito");


        //Finalmente para saber el tamaño actual de mi ArrayList usamos el metodo .size
        System.out.println("La longitud de mi array es de : " + listaDeCompras.size());






    }
}
