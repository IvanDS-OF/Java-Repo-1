public class Calculadora {
    //Este programa es la Clase para crear las operaciones necesarias para manejar Funciones
    //y entender cómo el el funcionamiento de los argumentos. 
    double calcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }



    double volumenPrismaRec(double alto, double ancho, double largo){
        return alto * ancho * largo ; 
    }


    //Hay veces en los que es necesario que el número de argumentos ingresados sea dinámico
    //como lo encontramos en Python que son los kargs o los args. para eso podemos hacer uso de:
    double calcularMedia(double ... numeros) {
        //Tner cuidado a la hora de introducir  0 valores. Para ello podemos usar la condicion IF
        if (numeros.length == 0){
            return 0;
        }

        //Lo que hace la propiedad ... es crear ya un vector con lo que podemos acceder con [] y un indice. 
        //Para obtener el valor de la media, primero es necesario sumarlos y luego dividir el resultado
        //entre la cantidad de valores encontrados. 
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i]; //Recordar que es un vector ya
        }  
        return suma / numeros.length;

    }



}
