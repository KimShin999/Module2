package Prime;

import java.util.Scanner;

public class DisplayNPrime {
    public static void main(String[] args) {
        System.out.println("hiển thị ra N số nguyên tố đầu tiên");

        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int N = scanner.nextInt();
        int number = 3;
        int a = 0;
        boolean b = false;

        if (a < N){
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    number++;
                    b = true;
                }
                if (!b){
                    System.out.println(number);
                    number++;
                    a++;
                }
            }
        }
    }
}
