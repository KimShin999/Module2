package kiemtranamnhuan;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        System.out.println("leap year test");
        System.out.println("nhập vào năm bạn muốn kiểm tra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("year: ");
        int year = scanner.nextInt();

        String result;

        if ( year % 4 == 0 && year % 100 != 0 ){
            result = "là năm nhuận";
        }else if (year % 100 == 0 && year % 400 == 0){
            result = "là năm nhuận";
        }else result = "không phải là năm nhuận";

        if (result != "") {
            System.out.printf("Năm %d %s", year, result);
        }else System.out.println("Nhập vào năm bạn muốn kiểm tra");
    }
}