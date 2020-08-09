package lopAnimalvaInterfaceEdible;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof  Tiger){
//                Edible edibler = (Chicken) animal;
                Edible ediblers = (Tiger) animal;
//                System.out.println(edibler.howToEat());
                System.out.println(ediblers.howToEat());
            }
        }



        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit a: fruits) {
            System.out.println(a.howToEat());
        }
    }
}
