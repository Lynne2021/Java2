package Class1;

public class CircleTest {
    public  static void main (String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.2);
        Circle c3 = new Circle();
        System.out.println(c3.getArea());//c3是no arg,没有radius值，所有不能output.
        System.out.println(c2.getArea());//也不能output,因为c2的3.2是private. 在constructor里并没有初始化赋zhi

    }
}
