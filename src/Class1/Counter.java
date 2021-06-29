package Class1;

public class Counter {
    private int value;
    private static int numberOfInstances = 0;
    public Counter(){
        numberOfInstances++;//显示建立的新object的数量在Mian里，所以它是static.新建立的new object,
        // 必须有constructor,才能够reference to this boject.
    }
    public void reset(){
        value = 0;
    }
    public int getValue(){
        return value;
    }
    public void click(){
        value++;
    }
    public static int howMany(){
        return numberOfInstances;
    }
}
