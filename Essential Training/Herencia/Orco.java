package Herencia;

public class Orco extends Enemigo{
    //Esta clase proviene de una sub sub clase

    //Creamos su constructor publico
    public Orco(int posicionX, int posicionY){
        super(0, 0);
        //La forma para mandar a llamar el constructor inicial es igual que en todos los casos
        //recordar hacer uso del comando *super
    }

    //Vamos a hacer una modificacion en el metodo Emitir Sonido De Dolor
    //Recordar colocar el coando Override
    @Override
    public void emitirSonido(){
        System.out.println("Soy un Orco AAAHHH_SONIDO DE DOLOR INTENSO");
    }
    //No importa de dónde vengan los metodos a modificar,
    //pueden ser de la Super clase inicial o dde la segunda Super clase











}
