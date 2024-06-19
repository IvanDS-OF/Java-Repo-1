import Juego.Contador;

public class mainJuego { 
    public static void main(String[] args) {
        
        //Vamos a mandar a llamar a las clases externas e internas que hemos creado en Juego.java

        //primero creamos un nuevo objeto con nuestro constructor principal
        Juego juego = new Juego(4);


        //PARA ACCEDER A UNA CLASE INTERNA, ES NECESARIO MANDARLA A LLAMAR PRIMERO DESDE LA EXTERNA
        Juego.Contador contadorJuego = juego.new Contador();
        //Para poder crear correctamente un objeto de una clas einterna. primero tenermos que crear un objeto
        //con la clase externa y con este objeto crear una instancia de la clase interna, como se muestra anteriormetne

        //Usamos uno de los metodos de nuestra clase externa
        System.out.println("Mostramos la puntuación actual: " + juego.obtenerPuntuacion());


        //Ahora vamos a hacer uso de nuestro metodo dentro de nuestra clase interna para hacer modificaciones a nuesta puntuacipin
        contadorJuego.incrementarPuntuacion(10);
        //Mostramos las modificaiones hechas
        System.out.println("Mostramos la puntuación actual: " + juego.obtenerPuntuacion());

        //Hacemos uso del otro metodo de nuestra clase interna
        contadorJuego.decrementarPuntuacion(2);
        System.out.println("Mostramos la puntuación actual: " + juego.obtenerPuntuacion());








    }
}
