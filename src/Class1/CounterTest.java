package Class1;

public class CounterTest {public static void main(String[] args){
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.click();
    c1.click();
    c2.click();
    System.out.println("c1 value = " + c1.getValue());
    System.out.println("c2 value = " + c2.getValue());
    System.out.println("Number of counter objects = " + Counter.howMany());
}
}
