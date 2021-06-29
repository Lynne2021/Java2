package Class1;

public class Record {
    private String name;
    private int id;

    public Record(String name, int id){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public static void modifyObject(Record r){
        r.id=100;
        r.name = "Meghrig";
    }
    public static void test(Record r){
        Record r1= new Record("test", 0);
        r=r1;
        r.id=200;
        r.name = "bla";
        System.out.println("here");
        System.out.println(r1.getName() +" , " + r1.getId());
        System.out.println(r.getName() +" , " + r.getId());
        System.out.println("here");


    }
}
