import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private int age;
    private int weight;

    private int numberOfLegs;

    public Animal(String name, int age, int weight, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }

    //For-LOOP
    public static List<Animal> FilterTwoLegs(List<Animal> animalsList){

        List <Animal> filteredList = new ArrayList<>();

        for (Animal a : animalsList) {
            if (a.getNumberOfLegs() == 2) filteredList.add(a);
        }
        return filteredList;
    }

    //Stream
    public static List<Animal> StreamFilterTwoLegs(List<Animal> animalsList){

        List <Animal> filteredlist = new ArrayList<>();

        filteredlist = animalsList.stream()
                .filter(animal -> animal.getNumberOfLegs() == 2)
                .toList();

        return filteredlist;
    }

    //For-LOOP
    public static List<Animal> FilterAgeOverTen(List<Animal> animalsList){

        List <Animal> filteredList = new ArrayList<>();

        for (Animal a : animalsList) {
            if (a.getAge() > 10) filteredList.add(a);
        }
        return filteredList;
    }

    //Stream
    public static List<Animal> StreamAgeOverTen(List<Animal> animalsList){

        List <Animal> filteredlist = new ArrayList<>();

        filteredlist = animalsList.stream()
                .filter(animal -> animal.getAge() > 10)
                .toList();

        return filteredlist;
    }

    //For-LOOP
    public static List<Animal> FilterAgeBetween(List<Animal> animalsList){

        List <Animal> filteredList = new ArrayList<>();

        for (Animal a : animalsList) {
            if (a.getAge() > 5 && a.getAge() < 8)  filteredList.add(a);
        }
        return filteredList;
    }

    //Stream
    public static List<Animal> StreamAgeBetween(List<Animal> animalsList){

        List <Animal> filteredlist = new ArrayList<>();

        filteredlist = animalsList.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getAge() < 8)
                .toList();

        return filteredlist;
    }
    /*

    List<Animal> animalsWeight30Age20 = animalsList.stream()
            .filter(animal -> animal.getWeight() > 30 && animal.getAge() < 20)
            .toList();

    List<Animal> animalsWeight30Age20Second = animalsList.stream()
            .filter(animal -> animal.getWeight() > 30)
            .filter(animal -> animal.getAge() < 20)
            .toList();

    List<Animal> animals4LegsStream = animalsList.stream()
            .filter(animal -> animal.getNumberOfLegs() == 4)
            .filter(animal -> animal.getAge() % 2 == 1)
            .toList();

     */

}
