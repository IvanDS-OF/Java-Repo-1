package Herencia;

public class Dragon extends Enemigo{
    
    private static final int PUNTOS_DE_DANO = 15;
    
    //Esta igualmente es una sub sub clase

    //Colocamos la configuracion de nuestro constructor
    public Dragon(int posicionX, int posicionY){
        super(3, 3);
    }

    //Hacemos la modificacion a alguno de sus metodos
    public int obtenerPuntosDano(){
        return PUNTOS_DE_DANO;
    }
    

}
