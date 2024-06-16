package com.ivanduran.banco;

public class CuentaBancaria {

    //Es aqui en donde creamos las propiedades de la clase cuenta Bancaria

    //Nuestras variables de instancia :D
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;


    //Para poder crear una instancia con esta clase en otra es necesario tener los 
    //constructores como Publicos

    //Constructores :D
    public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }


    public CuentaBancaria(String titular, double saldo){
        this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    public CuentaBancaria(){
        this("", TipoDeCuenta.AHORRO, 0);
    }

    //METODOS :D
    public void sacarDinero(double cantidad){
        if(cantidad < 0){
            return;
            //Lo hacemos porque no podemos restar una cantidad negativa
        }
        double comision = calcularComision();
        saldo = saldo - comision;
        saldo = saldo - cantidad;
        //No colocamos el Return porque solamente vamos a hacer modificaciones a las variables conocidas
    }

    private double calcularComision(){ 
        //Esste es un ejemplo de un metodo de uso interno
        //No es necesario hacerlo publico
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
    }

    public void ingresarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo = saldo + cantidad;
    }


    protected void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        //Dado que este metodo no es muy usado, de momento lo colocaremos como Protected
        tipoDeCuenta = nuevoTipo;
    }

    public double obtenerSaldo(){
        return saldo;        
    }








}