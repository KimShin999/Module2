package Circle;

import Circle.Circle;

public class ProgramCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);

        double A = circle.getArea();
        System.out.println(A);

        double B = circle.getRadius();
        System.out.println(B);
    }
}
