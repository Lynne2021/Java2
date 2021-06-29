package Class4;

public class Cat extends Animal{
    private String name;

    public Cat(){
        super();
    }

    public Cat(double movementSpeed, String  diet, double size, String name){
        super(movementSpeed,diet,size);
        this.name=name;
    }

    @Override
    public void makeNoise(){
        System.out.println("Meowwwwwwwwwwwwww!");
    }

}
