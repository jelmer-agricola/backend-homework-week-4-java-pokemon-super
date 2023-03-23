package src;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 80, 10, "yellow", "poke-bowl", "pika pika");

        System.out.println(pikachu.getName() + " eats " + pikachu.getFood());

        System.out.println();
        System.out.println("We start with " + pikachu.getName());
        pikachu.tackle();
        pikachu.makeSound();
        pikachu.lightningBolt();

    }
}
