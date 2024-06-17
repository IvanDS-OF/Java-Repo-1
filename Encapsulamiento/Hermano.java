public class Hermano {
    
    //Vamos a concer las variables de clase y las variables d einstancia

    //Primero vamos a crear nuestra variable de instancia
    String nombre = "Ivan";

    //Ahora creamos una variable de clase ya que
    //va a estar definida como estatica
    static String apellido = "Duran";
    //Esta bariable es posible mandarla a llamar desde otra clase SIN LA NECESIDAD DE CREAR UNA INSTANCIA



    //Para acceder a una variable estatita solamente es posible desde un metodo estatico
    static String obtenerApellido(){
        // return nombre; // Esto es incorrecto porque la variable nombre es de instancia
        //Esta esta bien ya que es una variable estatica de clase
        return apellido;
    }

    static void modificarApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }




}
