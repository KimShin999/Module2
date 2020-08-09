package Circle;

public class Circle {
    private double r = 1.0;
    private String color = "red";

    Circle(){};

    Circle(double r){
        this.r = r;
    }

    protected double getRadius(){
        return this.r;
    }

    protected double getArea(){
        double Area = Math.PI*Math.pow(this.r, 2);
        return Area;
    }
}
