package Class1;

public class TestRecord {
    public static void main (String[] args){
        Record r1 = new Record("John", 1234);
        System.out.println(r1.getName() +" , " + r1.getId());
        Record.modifyObject(r1);
        System.out.println(r1.getName() +" , " + r1.getId());
        Record.test(r1);
        System.out.println(r1.getName() +" , " + r1.getId());

    }
}
