package zoo;

public class Main {
    public static void main(String[] args) {
        // Without collections, we can use fixed objects
        Lion lion = new Lion(80, "Healthy");
        Elephant elephant = new Elephant(90, "Healthy");
        Monkey monkey = new Monkey(70, "Injured");

        // Using polymorphism with an array
        Animal[] animals = {lion, elephant, monkey};

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println("Health: " + animal.getHealth() + ", Status: " + animal.getStatus());
            System.out.println();
        }
    }
}
