package lopAnimalvaInterfaceEdible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "lêu lêu";
    }

    @Override
    public String howToEat() {
        return "tèo";
    }
}
