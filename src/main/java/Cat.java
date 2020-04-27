import java.util.Random;

public class Cat extends Animal {

    public Cat(String catName, int catSex){
        super(catName, "Cat", catSex);
        // max latitude in (1, 2)
        maxLatitude = new Random().nextInt(1) + 1;
        // max run distance in (100, 200)
        maxRunDistance = new Random().nextInt(100) + 100;
    }

    @Override
    public void swim(int swimDistance) {
        System.out.printf("Cats doesn't like water!\n");
    }

    @Override
    public void printInfo() {
        System.out.printf("---------------\n");
        System.out.printf("Name of the Cat: %s\n", name);
        System.out.printf("Sex of %s is %s\n", name, ANIMAL_SEX[sex]);
        System.out.printf("Max jumping latitude: %.1f\n", maxLatitude);
        System.out.printf("Max running distance: %d\n", maxRunDistance);
        System.out.printf("Cats doesn't swimming...\n");
    }
}
