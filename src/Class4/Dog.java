package Class4;

public class Dog extends Animal {
    private String purpose;

    public Dog(){
        super();
    }
    public Dog(double movementSpeed, String  diet, double size, String purpose){
        super(movementSpeed,diet,size);
        this.purpose = purpose;
    }
    public void makeNoise(){
        System.out.println("WoofWoof!!!!!!!!!!");
    }

}
