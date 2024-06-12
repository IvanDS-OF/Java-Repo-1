public class StringsJava {
    public static void main(String[] args) {
        //En todo lenguaje de programacion es importante saber como manipular Strings
        //Para ello, Java tiene la facilidad de que los String son objetos
        //Por lo que cuenta con las propiedades de ellos. 

         String stringUno = "abcde";
         //Para descomponer un string en carácteres es necesario crear una nueva variable de tipo CHAR
         char caracter; //Solo la declaramos
         caracter = stringUno.charAt(0); //Uso del método charAt
         //Para consultar más metodos es necesario acudir a la DOCUMENTAION de Oracle :D
         //Mostramos en pantalla
         System.out.println("Mi caracter 0 de mi string es; " + caracter);


         //Otro metodo interesante es para concatener
         System.out.println("Concatener dos variables " + stringUno.concat("AyudaDios"));
         //Otra forma sería usando el operador Suma
        System.out.println(stringUno + "AyudaDios" + " JA");

        //Otro metodo igual de necesario e interesante es para saber si es igual a un valor
        String NombreIvan = "Ivan";
        String NombreAleatorio = "Jasmin";

        System.out.println("El nombre: " + NombreAleatorio + " Es igual a: " + NombreIvan + " : " + NombreIvan.equals(NombreAleatorio));




    }
}
