package PracticasIniciacion;

public class Ejercicio04 {
    //Metodos dentrod e mis clases
    //Para crear un metodo interno a parte de la clase principal main
    //Lo podemos hacer al final de nuestra SuperClase
    //y ovbiamente fuera de nuestra clase main
    public static void main(String[] args) {
        int numClientes = Integer.valueOf(args[0]);
        int numEmpleados = Integer.valueOf(args[1]);
        int numSillas = Integer.valueOf(args[2]);
        int numMesas = Integer.valueOf(args[3]);
        int numContratos = Integer.valueOf(args[4]);
        int numReclamaciones = Integer.valueOf(args[5]);

        int numPersonas = suma(numClientes, numEmpleados);
        int numMuebles = suma(numSillas, numMesas);
        int numExpedientes = suma(numContratos, numReclamaciones);


        System.out.println("Tenemos " + numPersonas + " personas, " + numMuebles + " muebles, " + 
        numExpedientes + " expedientes.");
    }

    //Es aqui en donde vamos a crear un metodo que puede ser usado en nuestra clase main

    private static int suma(int cantidad1, int cantidad2){
        return cantidad1 + cantidad2;
    }


}
