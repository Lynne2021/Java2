package Exercise2;

import javax.print.attribute.standard.PresentationDirection;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle = new Circle(2.0);
        Circle circle3 = new Circle(  "green",false , 3.0);
        circle3.setRadius(5);
        System.out.println( "Area of the circle is :" +circle3.getArea());
        System.out.println("Perimeter of the circle is "+ circle3.getPerimeter());
        System.out.println(circle3.toString());

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2= new Rectangle(3.0,4.0);
        Rectangle rectangle3 = new Rectangle("blue",true,1.0,1.0);
        rectangle3.setWidth(10);
        System.out.println(rectangle3.toString());
        System.out.println(" Area of the rectangle is "+ rectangle3.getArea());
        System.out.println(" Perimeter of the rectangle is "+ rectangle3.getPerimeter());
        Square square1 = new Square();
        Square square2 = new Square(10);
        Square square3 = new Square("white",true,6.0);
        square3.setSide(4.0);
        System.out.println(" Area of the square is "+ square3.getArea());
        System.out.println(" Perimeter of the square is "+ square3.getPerimeter());
        System.out.println(square3.toString());







    }

}
