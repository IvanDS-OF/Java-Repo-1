package Herencia.ClasesAbstractas;

public class Triangulo extends Figura2D {
    //Esta clase se extiende de una clase abstracta por eso la esructura @override de esta clase

    //Es necesario definir nuesrto constructor porque anteriormente no lo hemos hecho
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Una vez creado nuestro constructor, vamos a hacer las modificaciones
    //respectivas a nuestros metodos

    @Override
    public double obtenerArea(){
        return lado1 * lado2 * lado3;
        //Así no se calcula el perimetro pero solo es una operacion demostrativa
    }


    @Override
    public double obtenerPerimetro(){
        return lado1 + lado2 + lado3;
    }







    
}
