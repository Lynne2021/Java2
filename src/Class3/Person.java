package Class3;

public class Person {
    private String firstName;
    private String middleName;
    private String LastName;

    public Person() {
    }

    public Person(String fName, String mName, String lName) {
        this.firstName = fName;
        this.middleName = mName;
        this.LastName = lName;
    }

    public void display() {
        System.out.println("I am a Person ");
    }
}

