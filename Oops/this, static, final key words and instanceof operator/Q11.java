class Animal {
    static int totalAnimals = 0;
    final int tagId;
    String name;
    String species;

    Animal(int tagId, String name, String species) {
        this.tagId = tagId;
        this.name = name;
        this.species = species;
        totalAnimals++;
    }

    static void displayTotalAnimals() {
        System.out.println("Total Animals: " + totalAnimals);
    }

    void displayAnimal() {
        if (this instanceof Animal) {
            System.out.println("Tag: " + tagId + ", Name: " + name + ", Species: " + species);
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        Animal a1 = new Animal(1, "Tommy", "Dog");
        Animal a2 = new Animal(2, "Kitty", "Cat");
        Animal.displayTotalAnimals();
        a1.displayAnimal();
        a2.displayAnimal();
    }
}
