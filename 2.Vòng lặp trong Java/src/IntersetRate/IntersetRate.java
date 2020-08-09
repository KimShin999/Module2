package IntersetRate;

import java.util.Scanner;

public class IntersetRate {
    public static void main(String[] args) {
        System.out.println("tính lãi suất ngân hàng");

        Scanner scanner = new Scanner(System.in);

        System.out.print("số tiền muốn gửi: ");
        double money = scanner.nextDouble();

        System.out.print("số tháng muốn gửi: ");
        int month = scanner.nextInt();

        System.out.print("lãi suất của một năm: ");
        double interset_rate = scanner.nextDouble();

        double total_interset = 0;

        total_interset = money*(1+ (interset_rate/1200) *month);

        System.out.printf("tổng số tiền gốc lẫn lãi là: %f",total_interset);
    }
}
