package Class3;

public class Student extends Person{
    private String studentNumber;
    private String major;

    public Student(){
    }
    public Student(String fName, String mName, String lName, String sNumber, String sMajor){
        super(fName, mName,lName);
        this.studentNumber = sNumber;
        this.major = sMajor;
    }
    public void display(){
        super.display();
        System.out.println("I am a Student ");

    }
    public void displayMajorandNumber(){
        System.out.println( this.major + ", "+ this.studentNumber);
    }


}
