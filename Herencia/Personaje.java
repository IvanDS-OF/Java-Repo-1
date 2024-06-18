public class Personaje {
    //La clase Personaje es nuestra supereclase
    private int puntosDeVida = 100;
    private int posicionX = 0;
    private int posicionY = 0;

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
