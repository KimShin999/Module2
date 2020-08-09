package checkPrime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("kiểm tra số nguyên tố");

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào: ");
        int number = scanner.nextInt();

        String result = "";
        if (number < 2 ){
            result = " is not a prime";
        }else {
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    result = "is not a prime";
                    break;
                }else result = "is a prime";
            }
        }

        System.out.printf("%d %s",number,result);
    }
}
