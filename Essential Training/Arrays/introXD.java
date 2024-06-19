public class introXD {
    public static void main(String[] args) {
        //Los arrays con vectores. Solamente pueden contener variables de un mismo tipo
        //Los arrays estás inplementados com objetos

        //Recordar que son objetos, por lo que es neceesario inicializarlos antes de usarlos
        //Tipo NombreString[] = new Tipo[longitud en Int];
        String diasSemana[] = new String[7];
        
        //Para acceder a los elementos en el array, vamos a hacer uso de un indice, que 
        //siempre empiezan en 0

        //Es posible declarar los valores de los arrays uno por uno, de la siguiente manera
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        //etc
        //Para acceder a ellos lo podemos hacer de la siguiente manera:
        System.out.println("Un dia de la semana: " + diasSemana[0]);


        //igualmente se pueden hacer as declaraciones de la siguiente manera
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Igualmetne ára accder a alguno lo podemos hacer de la siguiente manea: 
        System.out.println("Un numero: " +  numeros[0]);



        //Experimento sencillo pa
        String a[] = {"a", "b", "c", "d"};
        System.out.println("una letera: " + a[0]);
        //Lo anterior fueron arreglos de una dimension VECTORES:::


        /* VAMOS A VER MATRICES :D */

        //Para inicializar un array de 2 dimensiones lo vamos a hacer como en Arduino
        int arrayDosDim[][] = new int[3][3];
        int arrayTresDim[][][] = new int[3][3][3];

        //Para llenar los valores hay varias formas, una es añadiendo valor por valor
        //y otra es mediante el uso de un ciclo for
        for (int i = 0; i < arrayDosDim.length; i++) {
            for (int j = 0; j < arrayDosDim.length; j++) {
                arrayDosDim[i][j] = i * j;
            }            
        }

        System.out.println("Valor deseado" + arrayDosDim[2][2]);

        System.out.println(arrayDosDim);

    }
}
