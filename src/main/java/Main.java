import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] ANIMAL_NAME_MALE = {"King", "Pharaon", "Big boy", "Spoom", "Pluto", "Mars", "Keeper"};
        String[] ANIMAL_NAME_FEMALE = {"Queen", "Beauty", "Pretty", "Catty", "Lessy", "Venus", "Tiny"};

        int animalsCount = new Random().nextInt(10);
        double animalSex;
        double animalType;
        String animalName;
        int dogCount = 0;
        int catCount = 0;

        Animal[] zoo = new Animal[animalsCount];

        for (int i = 0; i < animalsCount; i++){
            animalSex = new Random().nextDouble();
            animalType = new Random().nextDouble();
            if (animalSex < 0.5){
                animalSex = 0;
                animalName = ANIMAL_NAME_MALE[new Random().nextInt(ANIMAL_NAME_MALE.length)];
            } else{
                animalSex = 1;
                animalName = ANIMAL_NAME_FEMALE[new Random().nextInt(ANIMAL_NAME_FEMALE.length)];
            }
            if (animalType < 0.5){
                zoo[i] = new Cat(animalName, (int) animalSex);
            }
            else{
                zoo[i] = new Dog(animalName, (int) animalSex);
            }
        }

        for (int i = 0; i < animalsCount; i++){
            zoo[i].printInfo();
            zoo[i].run(150);
            zoo[i].jump(0.5);
            zoo[i].swim(6);
            if (zoo[i] instanceof Cat){
                catCount++;
            }
            if (zoo[i] instanceof Dog){
                dogCount++;
            }
        }

        System.out.printf("\nThere are %d cats and %d dogs in our zoo\n", catCount, dogCount);
    }
}
