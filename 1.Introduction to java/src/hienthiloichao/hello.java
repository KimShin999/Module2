package hienthiloichao;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.println("hello: " + name );
    }
}
