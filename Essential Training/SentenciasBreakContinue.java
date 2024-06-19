import java.util.Scanner;

public class SentenciasBreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Vamos a conocer ahora nuestras s entencias de control Break and Continue :D

        //Break sirve para cortar una sentencia ciclica en un punto determinado dada una condicion determinada
        //Vamos a iterar en For del 1 al 20 pero detenemos en 10
        int ValorFinal = 5;
        int Incremento = 0;
        for (int i = 1; i <= 20 ; i++){
            System.out.println("Estamos en el valor " + i);
            Incremento = i;
            //Para hacer uso correcto de la sentenci Break podemos hacer uso de una condicional If
            if (Incremento == 10) {
                System.out.println("Ya llevamos a 10 pa, fuga");
                break; //Tan sencillo como colocar la palabra reservada CBREAK
            }

        }
        System.out.println("Terminamos el clico en : " + Incremento + " Bai");

        
        
        
        
        //Continue sirve para continuar una sentencia ciclica dad una condicion determinada en un punto determinado 
        //Vamos a mostrar los numero paras del 1 al 100
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                //Igualmente se puede mandar a llamar mediante una secuencia IF. 
                continue;
                //La sentencia esta siempre delimitada por los {} Brackets 
            }            
            System.out.println("Current Number: " + i);
        }
        


    }
}
