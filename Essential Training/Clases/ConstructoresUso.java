public class ConstructoresUso {
    public static void main(String[] args) {
        //Vamos a crear nuestro objeto desde la clase en donde tenemos ya los constructores. 
        //Primero creamos el objeto:
        ObjetosCuentaBancaria CuentaIvan = new ObjetosCuentaBancaria("Ivan Duran", "Nomina Premium", 100);
        //Los constructores nos obligan a colocar los argumentos necesarios para que funciones a la hora
        //de crear por primera vez a nuestro objeto. Son los parametroa obligatorios. 

        System.out.println("Nombre de cuenta: " + CuentaIvan.Titular);

        //Creamos un nuevo objeto pero ahora con las constantes y las mandamos a llamar
        ObjetosCuentaBancaria CuentaLily = new ObjetosCuentaBancaria("Liliana Sanchez", ObjetosCuentaBancaria.TIPO_NOMINA , 5_000);

        System.out.println("El tipo de cuenta es : " + CuentaLily.TipoDeCuenta);


    }
}
