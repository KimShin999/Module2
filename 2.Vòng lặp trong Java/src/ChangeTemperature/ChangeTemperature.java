package ChangeTemperature;

import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi nhiệt độ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("0. Exit");
        int choose = scanner.nextInt();

        if (choose == 1){
            System.out.println("nhập độ C (celsius): ");
            double celsius = scanner.nextDouble();
            System.out.printf("Fahrenheit: %f",CelsiusToFahrenheit(celsius));
        }else if (choose == 2){
            System.out.println("nhập độ F (fahrenheit): ");
            double fahrenheit = scanner.nextDouble();
            System.out.printf("Fahrenheit: %f",FahrenheitToCelsius(fahrenheit));
        }else return;
    }



    public static double CelsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }


    public static double FahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) *(fahrenheit - 32);
        return celsius;
    }
}
