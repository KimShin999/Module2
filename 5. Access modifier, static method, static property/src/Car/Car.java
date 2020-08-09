package Car;

public class Car {
    private String name;
    private String engine; //động cơ

    public static int numberOfCars;

    public Car(String name , String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getNameCar(){
        return this.name;
    }

    public String getEngine(){
        return this.engine;
    }
}
