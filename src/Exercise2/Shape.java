package Exercise2;
public abstract class  Shape {
    public  String color ;
    public  boolean filled ;
    public Shape() {
        color ="red";
        filled =true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(String color){
       return this.color = color;
    }
    public void setColor(String color1){
        color = color1;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled =filled;
    }
    @Override
    public String toString(){
        return "A shape with color of " + this.color +" is "+ this.filled+".";
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}






