package Herencia.Interfaces;

public interface Reproductor {
    //Ya que esta es una interface, es necesario colocar la palabra Interface. 
    //Creamos sus respectivos metodos publicos


    public void repoducir();

    public void pausar();
    
    public void parar();

    public void rebobinar(int segundos);

    public void adelantar(int segundos);


    //Nos podemos dar cuenta de que los metodos estan DELCARADOS pero no estan implementados
    //Es a la hora de crear las nuesvas instancias que van a implementar esta interfaz cuando
    //configuramos nuestros metodos. 



}
