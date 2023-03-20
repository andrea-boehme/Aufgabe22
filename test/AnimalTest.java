import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal a1 = new Animal("cat", 1, 5, 4);
    Animal a2 = new Animal("dog", 2, 10, 4);
    Animal a3 = new Animal("bird", 3, 2, 2);
    Animal a4 = new Animal("frog", 4, 1, 4);
    Animal a5 = new Animal("mouse", 5, 1, 4);
    Animal a6 = new Animal("hamster", 6, 3, 4);
    Animal a7 = new Animal("cow", 7, 30, 4);
    Animal a8 = new Animal("pig", 8, 10, 4);
    Animal a9 = new Animal("horse", 11, 25, 4);
    Animal a10 = new Animal("turtle", 10, 10, 4);

    private final List<Animal> animalsList = new ArrayList<>(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10));

    @Test
    public void streamFilterTwoLegs() {
        assertEquals(List.of(a3), Animal.StreamFilterTwoLegs(animalsList));
    }

    @Test
    public void streamAgeOverTen() {
        assertEquals(List.of(a9), Animal.StreamAgeOverTen(animalsList));
    }

    @Test
    public void streamAgeBetween() {
        assertEquals(List.of(a6, a7), Animal.StreamAgeBetween(animalsList));
    }
}