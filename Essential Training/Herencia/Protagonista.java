package Herencia;

public class Protagonista extends Personaje {
    //Para hacerle saber que estamos haciendo una extension de la clase Jugador
    //Vamos a colocar la palabra *extend + la clase a la cual nos queremos extender

    //Ahora nuestro Prota contiene todas las features que tienen los personajes
    //y además le podemos ir añadiendo más cosas que otros personajes no tienen
    //En este caso seria la funcion que permite curar automaticamente al personaje

    protected String nombre;

    //Es necesario crear un constructor para esta clase hijo
    //Pero es necesario mandar a llamar de una forma especial a las variables de instancia
    //de nuestra super clase usando super(variableuno, variabledos)
    public Protagonista(int posicionX, int posicionY, String nombre){
        super(posicionX, posicionY); // Es así como inicializamos nuestras variables de la SuperClase
        //Desde el interior de nuestra subclase
            //Ya no es necesairo hacer nada mas, ja
            //El constructor ya puede ser usado desde nuestro objeto en otra instancia

        //En caso de querer añaadir más elementos a nuestro constructor de nuesra Sub Clase
        //Lo podemos hacer de forma normal

        this.nombre = nombre;
    }



    public void curarPresonaje(int puntosDeCura){
        puntosDeVida = puntosDeVida + puntosDeCura;
        //Dado que las variables en un inicio son Private, no podemos acceder a ellas
        ///Para ejemplo en este caso, cambiaremos esa configuraicon a Protected
        //Pero lo recomendable es hacer uso de funciones que puedan modificar los valores
    }

    
    //Otro metodo que puede diferenciar al prota de los demas personajes seria; 
    private static final int UNIDADES_DE_SALTO = 10;

    public void saltar(){
        posicionY = posicionY + UNIDADES_DE_SALTO;
    }

    //Existen casos en los que los metodos de nuestra SuperClase no encajan a la perfeccion
    //con nuestra sub clase, y es necesario modificar algunos parametros o en este caso
    //sobreescribir el metodo usando la palabra *override de la siguiente manera
    @Override //Colocamos inmediatamente el metodo modificando el contenido interno
    public void emitirSonido(){
        System.out.println("ah, mi tobillo");
    }






}
