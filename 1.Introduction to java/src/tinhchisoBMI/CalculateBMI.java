package tinhchisoBMI;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số BMI");
        System.out.println("nhập vào cân nặng và chiều cao của bạn");

        Scanner scanner = new Scanner(System.in);

        System.out.print("weigh: ");
        double weight = scanner.nextDouble();

        System.out.print("height: ");
        double height = scanner.nextDouble();

        double BMI = weight/Math.pow(height,2);

        String ketqua = "";

        if (BMI < 18.5){
            ketqua = "Underweight";
        }else if (BMI <= 25){
            ketqua = "Normal";
        }else if (BMI < 30){
            ketqua = "Overweight";
        }else if (BMI >= 30){
            ketqua = "Obese";
        }

        System.out.println(ketqua);

    }
}
