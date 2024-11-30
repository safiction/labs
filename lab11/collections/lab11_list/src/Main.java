import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_ANIMALS = 3;

        AnimalMethods MethodsActivation = new AnimalMethods();

        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_ANIMALS; i++) {
            animals.add(new Animal());
        }

        MethodsActivation.displayAnimals(animals);
    }
}

class AnimalMethods {
    public void addAnimal(List<Animal> l, Animal animal) {
        l.add(animal);
        System.out.println("An animal was successfully added to your list!");
        System.out.println("Number of animals now: " + l.size());
    }

    public void removeAnimal(List<Animal> l, int index) {
        if (index < 0 || index >= l.size())
            System.out.println("Index is out of range, no animal is on the position " + index);
        else {
            l.remove(index);
            System.out.println("Animal was successfully removed");
        }
    }

    public void displayAnimals(List<Animal> list) {
        System.out.println("---------- The list of your animals ----------");
        for (Animal a : list) {
            System.out.println(a);
        }
    }

    public void updateAnimal(List<Animal> l, Animal animal, int index) {
        l.set(index, animal);
        System.out.println("Animal was successfully updated on the index " + index + "!");
    }
}