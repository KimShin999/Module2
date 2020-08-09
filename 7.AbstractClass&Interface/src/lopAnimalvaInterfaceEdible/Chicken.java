package lopAnimalvaInterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "cục cục cục cức";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
