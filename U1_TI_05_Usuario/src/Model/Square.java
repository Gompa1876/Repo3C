 package Model;

public class Square {

    private double lado;

    public double getPerimeter() {
        return lado * 4;
    }

    public double getArea() {

        return lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }


}
