package tinhsongaytrongthang;

import java.util.Scanner;

public class DaysInMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which month that you to count days ?");
        int month = scanner.nextInt();

        String daysinmon;
        switch (month){
            case 2:
                daysinmon = " 28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysinmon = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysinmon = "30";
                break;
            default:
                daysinmon = "";
                break;
        }
        if (daysinmon != "" ){
            System.out.printf("The month '%d' has %s days!", month, daysinmon);
        }else{ System.out.print("Invalid input");
        }
    }
}
