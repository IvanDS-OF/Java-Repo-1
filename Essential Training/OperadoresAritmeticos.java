public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //SUMA: 
        int Var1 = 5;
        int Var2 = 2;
        int ResSuma = Var1 + Var2;
        System.out.println("Resultado de la suma: " + ResSuma);

        String Var3 = "Este es un texto pa";
        String Var4 = "Este es otro texto, padresanto";
        String SumChar = Var3 + Var4;
        System.out.println(SumChar);

        //La multiplicación es igual, se usa el  *

        //En la division podemos encontrar dos escenarios, uno en donde el valor es redondeado
        //Y otra en donde tenemos que vcambiar el tipo a uno de nuestros valores: 
        int DivVarInt = Var1 / Var2;
        System.out.println("Valor de nuestra division: " + DivVarInt);

        double DivVarDouble = (double)Var1 / Var2;
        System.out.println("Valor correcto de la division con decimales: " + DivVarDouble);
        //Para cambiar el tipo de forma momentanea a nuestra variable es necesario colocar entre paréntesis 
        //el nuevo tipo deseado para la variable antes de mandarla allamar :D

    }
}
