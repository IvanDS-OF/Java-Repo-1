public class Main {
    public static void main(String[] args) {
        //Vamos a hacer usode las variables de clase
        //y las variables de instancia


        //Tenemos una clase en donde vamos a mandar a llamar a una variable de clase (estatica) que
        //Tal cual no ses necesario crear una nueva instancia desde aqui

        System.out.println("El apellido de Ivan es: " + Hermano.apellido);
        //El valor, sin problema, es mostrado sin necesidad de crear una nueva instancia


        //Cuando creamos una nueva instancia, es posible cambiar el valor de las variables de instancia (no static)
        Hermano hermanoMenor = new Hermano(); //Creamos la instancia
        Hermano hermanoMayor = new Hermano();

        //Damos valores a nuestras variables de instancia (no static)
        hermanoMenor.nombre = "Ivan";
        hermanoMayor.nombre = "Martin";

        //Mostramos en pantalla cómo se ven los resultados
        System.out.println("Nombre del menor es: " + hermanoMenor.nombre + " y el apellido es: " + Hermano.apellido);
        System.out.println("Nombre del mayor es: " + hermanoMayor.nombre + " y el apellido es: " + Hermano.apellido);


        //En caso de querer cambiar el valor de  nuestra variable de instancia lo podemos hacer sinplemente 
        //dando nuevamente un valor diferente
        hermanoMenor.nombre = "John";
        //Y el valor será cambiado sin tema
        System.out.println("Nombre del menor es: " + hermanoMenor.nombre + " y el apellido es: " + Hermano.apellido);
        System.out.println("Nombre del mayor es: " + hermanoMayor.nombre + " y el apellido es: " + Hermano.apellido);



        //Pero no ocurre lo mismo en las variables de clase NO




    }
}
