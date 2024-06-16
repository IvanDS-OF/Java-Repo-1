package com.ivanduran.banco;

public class CuentaBancaria {

    //Es aqui en donde creamos las propiedades de la clase cuenta Bancaria

    //Nuestrs variables de instancia :D
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;


    //Constructores :D
    CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }


    CuentaBancaria(String titular, double saldo){
        this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    CuentaBancaria(){
        this("", TipoDeCuenta.AHORRO, 0);
    }

    //METODOS :D
    /* 
    void sacarDinero(double cantidad){
        return saldo - cantidad;
    }
    */














}