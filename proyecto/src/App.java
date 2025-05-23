import Model.Square;
import Model.circulo;
import Model.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        

        //Todo esto es para mostrar los datos de las formulas para cuadrado
        Square sq = new Square();
        sq.setLado(10);
        System.out.println("Lado: " + sq.getLado());
        double squarePerimeter = sq.getPerimeter();
        System.out.println("Perímetro del cuadrado: " + squarePerimeter);
        System.out.println("Área del cuadrado: " + sq.getArea());


        
        //Todo esto es para mostrar los datos de las formulas para circulo
        circulo c = new circulo();
        c.setRadio(20);
        System.out.println("perimetro del circulo: " + c.getPerimeter2()); 
        System.out.println("Area del circulo: " + c.getArea2());



        Triangulo t = new Triangulo();
        t.setLado3(20);
        t.setAltura(5);
        t.setBase(10);
        System.out.println("perimetro: " + t.getPerimeter3()); 
        System.out.println("Area del Triangulo: " + t.getArea3());

    }
}
