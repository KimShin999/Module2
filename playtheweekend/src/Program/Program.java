package Program;

import Entities.Student;
import Method.Functions;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Functions F = new Functions();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Hello every body, wellcome to Student management system");
            System.out.println("1: Add");
            System.out.println("2. Remove");
            System.out.println("3: Update");
            System.out.println("4: Search");
            System.out.println("5: Get All");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Enter Student id: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Enter Student name: ");
                    String name = input.nextLine();
                    System.out.println("Enter birthday (ex: 01/01/2020): ");
                    String birthday = input.nextLine();
                    System.out.println("Enter Class in School: ");
                    String classid = input.nextLine();
                    System.out.println("Enter Niên Khóa (ex: 2014-2020): ");
                    String nienkhoa = input.nextLine();
                    System.out.println("Enter address: ");
                    String address = input.nextLine();
                    System.out.println("Enter Email: ");
                    String email = input.nextLine();

                    Student std = new Student(id, name, birthday, classid, nienkhoa, address,email);
                    F.add(std);
                    break;

                case 2:
                    System.out.println("Enter Id Student you want Remove: ");
                    id = input.nextInt();
                    F.remove(id);
                    break;

                case 3:
                    System.out.println("You want update Infomation Student, Please Enter: ");

                    System.out.println("Enter Student id: ");
                    id = Integer.parseInt(input.nextLine());
                    System.out.println("Enter Student name: ");
                    name = input.nextLine();
                    System.out.println("Enter birthday (ex: 01/01/2020): ");
                    birthday = input.nextLine();
                    System.out.println("Enter Class in School: ");
                    classid = input.nextLine();
                    System.out.println("Enter Niên Khóa (ex: 2014-2020): ");
                    nienkhoa = input.nextLine();
                    System.out.println("Enter address: ");
                    address = input.nextLine();
                    System.out.println("Enter Email: ");
                    email = input.nextLine();

                    std = new Student(id, name, birthday, classid, nienkhoa, address,email);

                    F.update(std);
                    break;

                case 4:
                    System.out.print("You want search Infomation Student, Please Enter");
                    System.out.print("Enter Student name: ");
                    name = input.nextLine();

                    F.search(name);
                    break;

                case 5:
                    System.out.print("You want see all Infomation Student");
                    F.getAll();
            }
        }while (true);

    }
}
