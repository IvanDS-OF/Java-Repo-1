public class ObjetosCuentaBancaria {
    //Antes de colocar nuestro constructor Main, vamos a colocar nuestros parametros del objeto a crear
    String Titular;
    EnumeracionClase TipoDeCuenta;
    double Saldo; 

    //En ocaciones es necesario  tener algunas valores por defecto, como si fuereren DropDown
    //Para no cometer errores a la hora de colocarlos en la creacion de objetos, 
    //Para ello ocupamos las constantes que se escriben de la siguiente manera. 
    //Es posible que las constantes sean publicas estaticas para que por fuera de este archivo puedan 
    //ser referenciadas con facilidada. Para ello es necesario colocar *public static* al inicio
    public static final String TIPO_NOMINA = "nomina";
    public static final String TIPO_AHORRO = "ahorro";
    
    //Creamos otra constante para restar: 
    final double COMISION = 1.2; // La usacoms como condicional en un metodo


    //Los constructores los podemos colocar inediatamente despues de declara las variables de instancia. 
    ObjetosCuentaBancaria(String t, String tipo, double s){
        //Los constructores NO Devuelven nada 
        //Los constructures son como en Python cuando utilizamos los .self
        Titular = t;
        TipoDeCuenta = tipo;
        Saldo = s;
    }

    //Es posible que los constructores solamente permitan  modificar algunos parametrod
    //y que otros se queden con un valor inicial por default. 
    ObjetosCuentaBancaria(String t, double s){
        Titular = t;
        TipoDeCuenta = "ahorro"; // En este caso, todos los objetos creados a partir de esta clase
        //y con este constructor, van a tener por defecto en el tipo de cuenta el valor deAhorro
        Saldo = s;
    }



    //Las anteriores son mis Variables de Instancia
    
    //Recordad:es necesario mandar a llamar esta clase mediante una instancia main
    //que tiene que ser, al menos, un nuevo archivo. 
    


    //**************************************2 */

    //Agregamos un metodo sencillo Recordando las teoria de ENCAPSULAMIENTO
    //void Significa que NO devuelve ningun valor

    void SacarDinero(double Cantidad){
        //Aqui colocamos las operaciones matematicas que van generar nuestros metodos
        Saldo = Saldo - Cantidad;
        if (TipoDeCuenta.equals(TIPO_NOMINA)) {
            Saldo = Saldo - COMISION;            
        }
    }

    void MeterDinero(double Cantidad){
        Saldo = Saldo + Cantidad;
    }

    void CambiarTipoDeCuenta(String NuevoTipo){
        TipoDeCuenta = NuevoTipo;
    }


    /*///////////////////////////////////////// */
    //Existen otros tipos de metodos en donde SI nos devuelve un valor a la hora de usarlos
    //Para ello es necesario seguir la siguiente sintaxis
    //Tipo NombreDelMetodo(){*Acciones}

    double ObtenerSaldo(){
        //La palabra return esta reservada precisamente para mandar a llamar el valor procesado,
        return Saldo;
        //Al igual que en Python, la palabra Return representa la ULTIMA LINEA DEL METODO
        //Lo que se encuentre despues no se va a ejecutar

    }

    double RestarSaldo(double Cantidad) {
        return Saldo - Cantidad;
    }






    //*************************************************** */
    //Los Constructores Definen el modo en el que se crean los objetos en Jaa
    //Tiene una estructura similar a un metodo, y tiene el mismo nombre de la clase comenzando por M








}
