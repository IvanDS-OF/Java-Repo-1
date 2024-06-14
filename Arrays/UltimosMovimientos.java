import java.util.concurrent.ThreadLocalRandom;

public class UltimosMovimientos {
    /*
     * Generar una lista de movimientos bancarios tipocos de forma aleatoria
     * La clase tendrá un unico metodo publico con dos parametros
     *  una con tipo int con el numero de movimientos deseados
     *  otro de tipo string donde se induca el tipo de moneda para los movimientos
     * movimientos disponibles: 
     *  Ingreso
     *  Retirada
     *  Pago con tarjeta
     *  nOMINA
     *  pAGO RECIBO
     * Se generará una lista con el numero de movimientos indicados por parametros en el que cada 
     * movimiento sera de uno de los anteriores tipos seleccionado de modo aleatorio
     * y en el que la cantidad de dinero sera un numero de tipo double aleatorio
     * entre 1 y 3000
     */

    private static final String TRANSFERENCIA = "Transferencia de: ";
    private static final String INGRESO = "Ingreso de: ";
    private static final String RETIRADA = "Retirada de: ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de: ";
    private static final String NOMINA = "Ingreso nomina de: ";
    private static final String PAGO_RECIBO = "Pago de recibo de: ";

    //Generamos nuestra lista que devlveremos al final como METODO
    ArrayList<String> obtenerMovimientos(int numeroMovimientos, String moneda){
       //creamos una variable qu ¿e contrendra nuestros movimientos y la iniciamos vacia. 
        
       ArrayList<String> movimientos = new ArrayList<>();
       
       //Generamos la lista de documentos para recopilar las interacciones. 
       for (int i = 0; i < numeroMovimientos; i++) {
            //Tenemos que seleccionar aleatoriamente un numero del 1 al 6
            //porque esa es la cantidad de movimientos disponibles 
            int numeroMovimientos = obtenerIntAleatorio(1, 6);
            
            //Creamos una variable para guardar el tipo de ovimiento y creamos un 
            //Switch Case para mostrar el Valor obtenido
            String tipoDeMovimiento;
            switch (numeroMovimientos) {
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento = RETIRADA;
                    break;
                case 4:
                    tipoDeMovimiento = PAGO_CON_TARJETA;
                    break;
                case 5:
                    tipoDeMovimiento = NOMINA;
                    break;
                case 6:
                    tipoDeMovimiento = PAGO_RECIBO;
                    break;
            
                default:
                    break;
            }

            //Hacemos uso de nuestro metodo para obtener el salgo: 
            double saldoAleatorio;
            saldoAleatorio = obtenerSaldo(1.0, 3000.0);
            
            //Ahora vamos a dar formato
            Strign movimiento = tipoDeMovimiento + String.format("%.2f", saldoAleatorio) + " " + moneda;

            //Finalmente vamos a hacer incrementos en nuestro arrayList
            movimientos.add(movimientos)
            //Y Salimos del buble y lo regreesamos con Return

       }

       return movimientos;

    }



    //Para obtener un numero aleatorio podemos hacer uso de otro metodo privado en tipo int
    private int obtenerIntAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }


    //Para la parte aleatoria del dinero tenemos que ahcer lo mismo que el anterior metodo
    //Pero es necesario que ahora sea double
    private double obtenerSaldo(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }




}
