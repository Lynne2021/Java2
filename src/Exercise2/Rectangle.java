package Exercise2;

public  class Rectangle extends Shape {
    public double width ;
    public double length;
    public Rectangle(){
        this. width =1.0;
        this. length =1.0;
    }
    public Rectangle(Double length,double width){
        this.width = width;
        this.length= length;
    }
    public Rectangle(String color, boolean filled ,double length, double width){
        super(color,filled);
        this.width = width;
        this.length= length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }
    public void setLength(double newLength){
        this.length = newLength;
    }
    @Override
        public double getArea() {
        return width*length;
        }
        @Override
      public double getPerimeter() {
        return (width+ length)*2;
        }
        @Override
         public String toString(){
        return super.toString()+"  A Rectangle with width = "+ width + "  and length = " + length;
         }



    }



