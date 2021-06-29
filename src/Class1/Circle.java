package Class1;

public class Circle {// The radius of this circle
    private double radius = 1.0;

    // Construct a circle object
    public Circle(){
    }

    // Construct a circle object
    public Circle(double newRadius){
        radius = newRadius;
    }

    // Return the area of this circle
    public double getArea(){
        return radius * radius * 3.14159;
    }

}
