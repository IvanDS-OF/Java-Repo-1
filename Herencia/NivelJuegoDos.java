package Herencia;

public class NivelJuegoDos {
    public static void main(String[] args) {
        //Vamos a hacer uso de las clases pero con los constrcutores
        //Creamos a  nuestro personaje enemigo
        Personaje enemigo = new Personaje(10, 0);

        Protagonista protagonista = new Protagonista(0, 0, "Ivancito");
        //De forma inicial no es posible hacer uso del constructor creado en la SuperClase
        //Es necesario crear un nuevo constructor en la Subclase

        enemigo.emitirSonido();

        protagonista.emitirSonido();

    }
}
