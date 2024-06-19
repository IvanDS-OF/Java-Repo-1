package Herencia;

public class Enemigo extends Personaje {
    //Declaramos una variable de los puntos de daño
    private static final int PUNTOS_DE_DANO = 10;

    //Creamos el constructor usando el constructor de la clase Super
    public Enemigo(int posicionX, int posicionY){
        super(1, 1);
        //Recordar que así es como se mandan a llamar las variables 
        //que tenemos dentro de nuestro constructor
    }


    //Agregamos unos metodos adicionales
    public int obtenerPuntosDano(){
        return PUNTOS_DE_DANO;
    }

    public void emitirSonidoDeFuria(){
        System.out.println("Grrrr");
    }


}
