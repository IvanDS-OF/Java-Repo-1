public class ValoresPrimitivos {
    public static void main(String[] args) {
        //vamos a colocar los valores primitivos y a mostrarlos en pantalla
        //Comenzamos con los bytes: 
        byte ElMenorByte = Byte.MIN_VALUE;
        byte ElMayorByte = Byte.MAX_VALUE;
        System.out.println("Bytes está comprendido entre: " + ElMenorByte + " y " + ElMayorByte);
        
        //Seguimos con los SHORTS
        short ElMenorShort = Short.MIN_VALUE;
        short ElMayorShort = Short.MAX_VALUE;
        System.out.println("Shorts está comprendido entre: " + ElMenorShort + " y " + ElMayorShort);

        //Continuamos con los Int - SON LOS VALORES NUMERICOS MAS UTILIZADOS
        int ElMenorInteger = Integer.MIN_VALUE;
        int ElMayorInteger = Integer.MAX_VALUE;
        System.out.println("Integer está comprendido entre: " + ElMenorInteger + " y " + ElMayorInteger);

        //Seguimos con las variables tipo Long
        long ElMenorLong = Long.MIN_VALUE;
        long ElMayorLong = Long.MAX_VALUE;
        System.out.println("Long está comprendido entre:" + ElMenorLong + " y " + ElMayorLong);


        //Igualmente existen variables decimales 
        float VarFloat = 1.005f; //REORDAR PONER LA "F" AL FINAL DE LA EXPRESION O FALOR
        System.out.println("Mi float Var es la siguiente: " + VarFloat);

        double VarDouble = 1.2;
        System.out.println("My var Double es: " + VarDouble);

        //Finalmente encontramos los tipos Char y Boolean
        char MyVarChar = 'A'; //SE COLOCAN ENTRE COMILLAS SIMPLES

        boolean MyBooleanVar = true; // Se colocan con minusculas 

        System.out.println("My Boolean Var is:" + MyBooleanVar);

        //Finalmente: Para representar un NULL es necesario declaralo como un string
        

    }
}
