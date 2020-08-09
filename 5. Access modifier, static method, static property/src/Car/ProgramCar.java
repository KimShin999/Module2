package Car;

public class ProgramCar {
    public static void main(String[] args) {
        Car car1 = new Car("MayBach", "Money");
        Car car2 = new Car("Land Rover Range Rover", "Dolar");

        System.out.println(Car.numberOfCars);
        System.out.print(car1.getNameCar() + " ------ ");
        System.out.println(car1.getEngine());

    }
}
