package Herencia.Interfaces;

public class ReproductorVideo implements Reproductor {
    //Ya que hacemos uso de una interfaz, vamos a hacer uso de la palabra *implement + clase Interfaz

    //Es necesario y forzoso que 

    //Basicamente es lo  mismo que el anterior, es la creacion de un esqueleto. 

    @Override
    public void repoducir(){
        System.out.println("Estamos Reproduciendo ");
    }

    @Override
    public void pausar(){
        System.out.println("Estamos Pausando");
    }
    
    @Override
    public void parar(){
        System.out.println("Estamos Parando");
    }

    @Override
    public void rebobinar(int segundos){
        System.out.println("Estamos Atrazando " + segundos);
    }

    @Override
    public void adelantar(int segundos){
        System.out.println("Estamos Adelantando " + segundos);
    }


}
