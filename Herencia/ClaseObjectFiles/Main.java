package Herencia.ClaseObjectFiles;

public class Main {
    public static void main(String[] args) {
        //Hacemos uso de nuestra clase
        Animal perro = new Animal("Perro", 4);
        Animal gato = new Animal("Gato", 4);

        //Vamos a hacer uso de los metodos que no hemos creado
        Animal otroPerro = new Animal("Perro", 4);

        System.out.println(perro.equals(otroPerro));
        //Da False ya que solamente devuelve True si son exactamente el mismo
        //Pero no si son iguales. ja xd

        //Vamos a mostrar cuál es el dato al que se refieren si son iguales exactamente
        //Es al Hash Code, que lo podemos obtener de la siguiente manera: 
        System.out.println("Externar Hashcode de Perro " + perro.hashCode());
        System.out.println("Externar Hashcode de Otro Perro " + otroPerro.hashCode());
        System.out.println("Externar Hashcode de Gaticho " + gato.hashCode());
        //Los hashcode siempreseran numeros int





    }
}
