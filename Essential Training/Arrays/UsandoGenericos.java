public class UsandoGenericos {
    public static void main(String[] args) {
        
        //Vamos a hacer uso de los genericos para poder entender su funcionalidad en el mundo real
        //Recordando, los Genericos nos permiter definir nuestro objeto con un tipo determinado diferente

        GenericosJava<String> caja1 = new GenericosJava<>("Sring Hola");

        //IMPORTANTE: No podemos hacer uso de las variables de tipo primitivo
        //Por lo que usaremos las que son cmoplemento de estos primeros. 

        Integer numeroCinco = 5;

        GenericosJava<Integer> caja2 = new GenericosJava<Integer>(numeroCinco);
        //Esto es posible porque primero antes definimos el tipo de el argumento de nuestra clase. 



        //Ahora vamos a ahcer uso de nuestro metodo
        //Primero creamos el elemento a comparar: 
        String perro = "Perro";

        //Ahora comparamos; 
        System.out.println("El valor: " + caja1 + " y su clase: " + caja1.getClass() + " Es igual al elemento " + perro + " Y su clase " + perro.getClass() + " :: " + caja1.perteneceElContenidoALaMismaClase(perro));

        System.out.println("El valor: " + caja2 + " y su clase: " + caja2.getClass() + " Es igual al elemento " + perro + " Y su clase " + perro.getClass() + " :: " + caja2.perteneceElContenidoALaMismaClase(perro));


        //caja2.perteneceElContenidoALaMismaClase(perro)    Asi   se usa el metodo de una clase .


    }
}
