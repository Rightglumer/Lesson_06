import java.util.Random;

public class Dog extends Animal {

    public Dog(String dogName, int dogSex){
        super(dogName, "Dog", dogSex);
        // max latitude in (0, 1)
        maxLatitude = Math.round(new Random().nextDouble() * 10) / 10;
        // max run distance in (400, 500)
        maxRunDistance = new Random().nextInt(100) + 400;
        // max swim distance in (5, 10)
        maxSwimDistance = new Random().nextInt(5) + 5;
    }
}
