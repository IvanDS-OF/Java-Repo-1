package Herencia;

public class Personaje {
    //La clase Personaje es nuestra supereclase
    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

    //Revisar las notas de construcor
    public Personaje(int posicionX, int posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void recibirDano(int puntosMenos){
        puntosDeVida = puntosDeVida - puntosMenos;
    }

    public void moverDerecha(int unidades){
        posicionX = posicionX - unidades;
    }

    public void moverIzquierda(int unidades){
        posicionX = posicionX - unidades;
    }

    public void emitirSonido(){
        System.out.println("ah, mi torax");
    }



}
