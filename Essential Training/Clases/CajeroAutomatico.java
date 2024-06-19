import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    //Proyecto
    //Tiene que emulas las funcionalidades que hace un cajero automatico

    //Primero hacemos nuestro constructor: Nos pedirá El Usuario y una contraseña
    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String identificador, String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50_000);
        cuentaBancariaActual = new CuentaBancaria("Nombre Cualquiera", cantidadAleatoria);
    }


    //Vamos a crear los metodos que son las siguientes acciones : 
    void mostrarSaldo(){
        //Usamos Void ya que no vamos a regersar ningun dato
        System.out.println("Su saldo es: " + cuentaBancariaActual.obtenersaldo);
    }

    double ingresarDinero(double saldo, double incremento){
        //Al saldo actual le vamos a colocar un incremento
        return saldo = saldo + incremento;
    }

    double sacarDinero(double saldo, double decremento){
        //Al saldo actual le vamos a hacer un retiro de dinero
        return saldo = saldo - decremento;
    }

    //Consulta movimientos anteriores: 
    Array consultaMovimientosAnteriores(){
        return movimientosAnteriores;
    }

    void salir(){
        System.out.println("Gracias por el uso de nuestro servicio, Vuelva prnto :D");
    }






}
