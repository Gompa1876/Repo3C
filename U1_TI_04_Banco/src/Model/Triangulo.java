package Model;

public class Triangulo {
    private double base;
    private double lado3;
    private double altura;

    public double getPerimeter3 (){
        return lado3 * 3;
    }

    public double getArea3(){
    return (base * altura) /2;
    }
    public void setLado3(double lado){
        this.lado3 = lado;
    }

    public double getlado(){
        return this.lado3;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
}    
