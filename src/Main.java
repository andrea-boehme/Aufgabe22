import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Animal> main(String[] args) {

        Animal a1 = new Animal("cat", 1, 5, 4);
        Animal a2 = new Animal("dog", 2, 10, 4);
        Animal a3 = new Animal("bird", 3, 2, 2);
        Animal a4 = new Animal("frog", 4, 1, 4);
        Animal a5 = new Animal("mouse", 5, 1, 4);
        Animal a6 = new Animal("hamster", 6, 3, 4);
        Animal a7 = new Animal("cow", 7, 30, 4);
        Animal a8 = new Animal("pig", 8, 10, 4);
        Animal a9 = new Animal("horse", 9, 25, 4);
        Animal a10 = new Animal("turtle", 10, 10, 4);

        List<Animal> animalsList = new ArrayList<>();

        animalsList.add(a1);
        animalsList.add(a2);
        animalsList.add(a3);
        animalsList.add(a4);
        animalsList.add(a5);
        animalsList.add(a6);
        animalsList.add(a7);
        animalsList.add(a8);
        animalsList.add(a9);
        animalsList.add(a10);

        int animalsListLength = animalsList.size();

        //System.out.println(animalsList);




       List<Animal> animalsListWithTwoLegsStream = animalsList.stream()
               .filter(animal -> animal.getNumberOfLegs() == 2)
               .toList();

        List<Animal> animalsAgeOver10Stream = animalsList.stream()
                .filter(animal -> animal.getAge() > 10)
                .toList();

        List<Animal> animalsAgeBetweenStream = animalsList.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getAge() < 8)
                .toList();

        List<Animal> animalsWeight30Age20 = animalsList.stream()
                .filter(animal -> animal.getWeight() > 30 && animal.getAge() < 20)
                .toList();

        List<Animal> animalsWeight30Age20Second = animalsList.stream()
                .filter(animal -> animal.getWeight() > 30)
                .filter(animal -> animal.getAge() < 20)
                .toList();

        List<Animal> animals4LegsStream = animalsList.stream()
                .filter(animal -> animal.getNumberOfLegs() == 4)
                .filter(animal -> animal.getAge() % 2 != 0)
                .toList();


        return animalsList;
    }
}