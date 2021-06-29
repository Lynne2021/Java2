package Class4;

public class TestAnimal {
    public static void main(String[] args){
        Animal[] animalKingdom = new Animal[3];
        animalKingdom[0]= new Cat(30,"meat",10,"minnie");
        animalKingdom[1]= new Dog(40,"meat",100,"Hunting");
        animalKingdom[2]= new Animal();


        for (int i=0;i<animalKingdom.length; i++){
            animalKingdom[i].makeNoise();
        }

    }
}
