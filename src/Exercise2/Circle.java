package Exercise2;

public class Circle extends  Shape {
    public double radius;
    public Circle(){
        this.radius =1.0;
    }
    public Circle(double radius) {
        this.radius = radius;

    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(double radius) {
        return this.radius;
    }
    public void setRadius(double radius1) {
        radius = radius1;
    }
    @Override
    public double getArea(){
     return radius * radius *3.14159;
    }
    @Override
    public double getPerimeter() {
      return 2*3.14159*radius;
    }
    @Override
    public String toString() {
        return" A Circle with radius = "  + radius+"." + super.toString();
    }
}