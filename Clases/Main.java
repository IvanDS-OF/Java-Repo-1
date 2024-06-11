public class Main {
    public static void main(String[] args) {
        //Es desd aqui que ya podemos mandar a llmanr a nuestra clase creada previamente

        //Primero vamos a mandar a llamar nuestra clase y a crear una nueva instancia 
        //Desde aqui que es nuestro main main
        ObjetosCuentaBancaria CuentaIvan = new ObjetosCuentaBancaria();
        //NombreDeClase NombreDeObjeto = new NombreDeClase();


        //Ahora solamente es necesario que mandemos a llamar los
        //Atributos de nuestra clase para colocar los valores 
        //De acuerdo con el nombre objeto que vamos a crear desde aqui. 
        CuentaIvan.Titular = "Ivancito";
        //No es necesario colocar aqui el tipo de variable
        //Porque ya lo tiene escrito en la clase. 
        CuentaIvan.TipoDeCuenta = "Premium";
        CuentaIvan.Saldo = 100.00;


        //Finalmente para mostrar los valoers en pantalla
        //Lo podemos hacer de la siguiente manera; 

        System.out.println("El saldo mi es: " + CuentaIvan.Saldo);

        //Solamente es necesario tener cuidado a la hora de 
        //NO crear devidamente el objeto y referenciarlo 
        //Por error a un otro ojeto ya creado. 






    }
}
