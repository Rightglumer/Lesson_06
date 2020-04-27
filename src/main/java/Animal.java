public class Animal {
    String[] ANIMAL_SEX = {"male", "female"};
    String name;
    String animalType;
    int sex;
    double maxLatitude;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String animalName, String animType, int animalSex){
        this.name = animalName;
        this.animalType = animType;
        this.maxLatitude = 0.0;
        this.maxRunDistance = 0;
        this.maxSwimDistance = 0;
        this.sex = animalSex;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance){
            System.out.printf("%s run for %d meters\n", name, runDistance);
        }
        else{
            System.out.printf("%d meters is too much run distance for this little %s\n", runDistance, animalType);
        }
    }

    public void swim(int swimDistance){
        if (swimDistance <= maxSwimDistance){
            System.out.printf("%s swim for %d meters\n", name, swimDistance);
        }
        else{
            System.out.printf("%d meters is too much swim distance for this little %s\n", swimDistance, animalType);
        }
    }

    public void jump(double latitude){
        if (latitude <= maxLatitude){
            System.out.printf("%s jump for %.1f meters\n", name, latitude);
        }
        else{
            System.out.printf("%.1f meters is too much jump latitude for this little %s\n", latitude, animalType);
        }
    }

    public void printInfo(){
        System.out.printf("---------------\n");
        System.out.printf("Name of the %s: %s\n", animalType, name);
        System.out.printf("Sex of %s is %s\n", name, ANIMAL_SEX[sex]);
        System.out.printf("Max jumping latitude: %.1f\n", maxLatitude);
        System.out.printf("Max running distance: %d\n", maxRunDistance);
        System.out.printf("Max swimming distance: %d\n", maxSwimDistance);
    }
}
