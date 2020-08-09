package UCLN;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        System.out.println("tìm ước chung lớn nhất của 2 số");

        Scanner scanner = new Scanner(System.in);

        System.out.print("số a: ");
        int numberA = scanner.nextInt();

        System.out.print("số b: ");
        int numberB = scanner.nextInt();

        numberA = Math.abs(numberA);
        numberB = Math.abs(numberB);

        if ( numberA == 0 || numberB ==0 ){
            System.out.println("No greatest common factor");
        }

        while (numberA != numberB){
            if (numberA > numberB){
                numberA = numberA - numberB;
            }else numberB = numberB - numberA;
        }
        System.out.println("Gratest common factor: " + numberA);
    }
}
