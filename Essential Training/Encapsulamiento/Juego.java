public class Juego {
    //Vamos a ver las clases internas  - Pertenecen al grupo de las clases anidadas 
    //Spm las clases que se declaran al interior de una clase mas grande o interfaz

    //Dentro de las clases anidadas, las clases internas son aquellas que no son estaticas

    private int numeroDeJugadores;
    private int puntuacion = 0;

    //constructor
    public Juego(int numeroDeJugadores){

        this.numeroDeJugadores = numeroDeJugadores; 

    }

    //Creamos un metodo
    public int obtenerPuntuacion(){
        return puntuacion;
    }


    //Ahora creamos nuestra clase interna anidada
    public class Contador {
        //Así como hemos hecho anteriormente, dentro de esta clase podemos hacer lo mismo de crear variables
        //crear metodos, constructores. Para este ejemplo lo que vamos a hacer es hacer un contador que modifique
        //la puntuación actual de nuestro jugador :D

        public void incrementarPuntuacion(int puntuacionSuma){
            puntuacion = puntuacionSuma + puntuacionSuma;
        }

        public void decrementarPuntuacion(int puntuacionMenos){
            puntuacion = puntuacion - puntuacionMenos;
        }



        
    }
 


    //Recordar que Una clase INTERNA puede acceder a todo lo que contiene nuestra clase externa
    //Pero unaExterna no puede aceder a los metodo y o variables d en uestra clase interna



}
