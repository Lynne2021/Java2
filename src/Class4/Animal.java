package Class4;
public class Animal {
private double movementSpeed;
private String diet;
private double size;
private static int countOfAnimals;

public Animal(){
        countOfAnimals++;
        }

public Animal(double movementSpeed, String  diet, double size){
        this.movementSpeed = movementSpeed;
        this.diet = diet;
        this.size = size;
        countOfAnimals++;
        }

public double getMovementSpeed() {
        return movementSpeed;
        }

public void setMovementSpeed(double movementSpeed){
        this.movementSpeed = movementSpeed;
        }

public static int getCountOfAnimals() {
        return countOfAnimals;
        }

public  void makeNoise(){
        System.out.println("I make a noise");
        }

@Override
public String toString(){
        return "movementSpeed: " + movementSpeed + "diet: " + diet+ "size:" + size;
        }
        }

/*public class Animal {
    private double movementSpeed;
    private String diet;
    private double size;
    private static int countOfAnimals;

    public Animal(){
        countOfAnimals++;
    }

    public Animal(double movementSpeed, String  diet, double size){
        this.movementSpeed = movementSpeed;
        this.diet = diet;
        this.size = size;
        countOfAnimals++;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed){
        this.movementSpeed = movementSpeed;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    public  void makeNoise(){
        System.out.println("I make a noise");
    }

    @Override
    public String toString(){
        return "movementSpeed: " + movementSpeed + "diet: " + diet+ "size:" + size;
    }*/


