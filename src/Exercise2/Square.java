package Exercise2;

public  class Square extends Rectangle {
    public Square() {
        super();
        }
    public Square(double side){
        super();
        this.setLength(side);
        this.setWidth(side);

    }
    public Square(String color, boolean filled, double side) {
        super(color, filled,side,side );

          }
          public double getSide(){
          return getLength();
          }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public double getArea(){
        return getSide()*getSide();
    }@Override
    public double getPerimeter() {
        return getSide()*4;
        }
    @Override
    public  String toString() {
        return super.toString()+ "A Square with side = "+ getSide();

    }
}
