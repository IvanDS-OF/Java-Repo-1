public class GenericosJava<T> {
    //Los genericos nos permiten crear clases, interfaces y metodos en los que el tipo
    //de alguna o algunas de sus variables es flexible
    //y es posilble especificarlo mediante un parametro

    //Para comenzar a construir la clase es necesario colocar <T> adelante de el nombre de nuestra clase
    //Haciendo referencia a Type

    //Comenzamos creando una variable de este tipo generico: 
    T elemento; 

    //Ahora inicializamos un constructor: 
    GenericosJava(T elementoT){
        this.elemento = elementoT;
    }

    //Ahora creamos un metodo para que nos devuelva el elemento introducido
    //Recordar que la T es el tipo
    T obtenerObjeto() {
        return elemento;
    }



    //ahora vavmos a crear un nueo metodo de tipo generico para hacer la comprobcion
    //Primero es necesario colocar el tipo generico y luego el tipo que va a regresar
    <V> boolean perteneceElContenidoALaMismaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }



}
