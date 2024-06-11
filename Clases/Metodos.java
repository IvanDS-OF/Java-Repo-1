public class Metodos {
    public static void main(String[] args) {
        /*Un metodo son una serie de instrucciones que manipulan datos para conseguir
         un resultado. Son los que nos permiten que haya acción en nuestros programas. 
         */

        //Primero vamos a crear nuestro objeto y vamos a darle cuerpo
        ObjetosCuentaBancaria CuentaMia = new ObjetosCuentaBancaria(); // Inicializamos el objeto
        CuentaMia.Titular = "Ivan";
        CuentaMia.TipoDeCuenta = "Premium";
        CuentaMia.Saldo = 25_000.00;

        //Mostramos incialmente los valores actuales de mi objeto 
        System.out.println("Objeto mas titular = " + CuentaMia.Titular);
        System.out.println("Objeto mas Tipo De Cuenta " + CuentaMia.TipoDeCuenta);
        System.out.println("Objeto mas Saldo: " + CuentaMia.Saldo);

        
        //Ahora vamos a hacer uso de los métodos sencillamente pa
        CuentaMia.SacarDinero(5000);
        //Mostramos cambio 1 en el saldo
        System.out.println("");
        System.out.println("Nuevo Saldo UNO: " + CuentaMia.Saldo);
        
        CuentaMia.MeterDinero(100);
        //Mostramos el Cambio 2 en el Saldo
        System.out.println("Nuevo saldo DOS: " + CuentaMia.Saldo);

        CuentaMia.CambiarTipoDeCuenta("Legend");

        //Mostramos todo nuevamente; 
        System.out.println("");
        System.out.println("Objeto mas titular = " + CuentaMia.Titular);
        System.out.println("Objeto mas Tipo De Cuenta " + CuentaMia.TipoDeCuenta);
        System.out.println("Objeto mas Saldo: " + CuentaMia.Saldo);



        /*//////////////////////////////////////////////////////////////////// */

        //Nuevamente creamos un nuevo objeto con la clase y le damos propiedades
        //Para hacer uso de los metodos que debuelven cosas :D
        ObjetosCuentaBancaria CuentaJasmin = new ObjetosCuentaBancaria(); // Inicializamos el objeto
        CuentaJasmin.Titular = "Jasmin";
        CuentaJasmin.TipoDeCuenta = "Nomina";
        CuentaJasmin.Saldo = 100.00;

        //Mostramos los valores actuales tal y como son: 
        System.out.println("***************************************************");
        System.out.println("Objeto mas titular = " + CuentaJasmin.Titular);
        System.out.println("Objeto mas Tipo De Cuenta " + CuentaJasmin.TipoDeCuenta);
        System.out.println("Objeto mas Saldo: " + CuentaJasmin.Saldo);

        //Hacemos uso de los metodos para mandar a llamar un valor y hacer un procesamiento con los metodos.
        System.out.println("");
        System.out.println("Usando Metodo Obtener Saldo: " + CuentaJasmin.Saldo);

        System.out.println("");
        System.out.println("Usando metodo Restar Saldo: " + CuentaJasmin.RestarSaldo(5));

        //Otra forma para hacer esto es de la siguiente manera:
        double SaldoMenos  = CuentaJasmin.RestarSaldo(5);

        System.out.println("");
        System.out.println("Usando metodo Restar Saldo: " + SaldoMenos);



    











    }
}
