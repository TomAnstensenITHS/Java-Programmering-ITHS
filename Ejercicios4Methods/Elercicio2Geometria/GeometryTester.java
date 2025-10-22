package Ejercicios4Methods.Elercicio2Geometria;

import Ejercicios4Methods.Rectangle;

public class GeometryTester {
    public static void main(String[] args) {
        
        Circle myCircle = new Circle(10.0);
        Rectangle myRectangle = new Rectangle(10.0,20.0);

        System.out.println("Area del circulo es " + myCircle.calculateArea());
        System.out.println("Perimetro del circulo es " + myCircle.calculatePerimeter());
        System.out.println("Él área del rectangulo es " + myRectangle.calculateArea());
        System.out.println("Él perímetro del rectangulo es " + myRectangle.calculatePerimeter());



    }
    
}
