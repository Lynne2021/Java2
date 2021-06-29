package Class3;

public class TestStudent {
    public static void main (String[] args){
        Person p1 = new Student();
        Person p2 = new Person("Meghrig", " ", "Terzian");
        Student s1 = new Student();
        Student s2 = new Student("Meghrig", " ", "Terzian", "1111111","Computer Science");
   //  p1.display();
   // p2.display();
     s1.display();
     s2.displayMajorandNumber();
    }
}
