package Program;

import OjecT.Employee;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Program {
    public static void main(String[] args) {
        Employee E = new Employee();
        Scanner input = new Scanner(System.in);
        int access = 0;

        do {
            startApp:
            {
                System.out.println("Chào mừng bạn đến tới hệ thống quản lý chuỗi THE COFFEE HOUSE");
                if (access == 3){System.out.println("Bạn đã nhập sai quyền truy cập");}
                System.out.print("vui lòng nhập quyền truy cập: ");
                String user = input.nextLine();
                    //lựa chọn quyền truy cập-------------------------------------
                    if (user.equals("manager")) {
                        access = 1;
                    } else if (user.equals("employee")) {
                        access = 2;
                    } else {
                        access = 3;
                        break startApp;
                    }

                    //quyền truy cập của manager----------------------------------
                if (access == 1){
                    do {
                        startManager:
                        {
                            System.out.println("Chào mừng bạn đến tới hệ thống quản lý chuỗi THE COFFEE HOUSE");
                            System.out.println("Bạn đang đăng nhập user manager");
                            System.out.println("1. Quản lý doanh thu");
                            System.out.println("2. Quản lý nhân viên");
                            System.out.println("3. Quản lý sản phẩm");
                            System.out.println("4. Quản lý khách hàng");
                            System.out.println("0. Exit");

                            String choice1 = input.nextLine();

                            //Doanh thu
                            if (choice1.equals("1")) {


                                //Quản lý nhân viên
                            } else if (choice1.equals("2")) {
                                do {
                                    startControlEmployee:
                                    {
                                        System.out.println("1. Add employee.");
                                        System.out.println("2. Remove employee. ");
                                        System.out.println("3. Update profile employee. ");
                                        System.out.println("4. Profile all employee. ");
                                        System.out.println("5. Search");
                                        System.out.println("0. Back. ");

                                        String choice11 = input.nextLine();

                                        switch (choice11) {
                                            case "1":
                                                System.out.println("Enter name employee: ");
                                                String name = input.nextLine();
                                                System.out.println("Enter NumberPhone employee: ");
                                                int numberPhone = Integer.parseInt(input.nextLine());
                                                System.out.println("Enter Date of birth employee: ");
                                                String dateOfBirth = input.nextLine();
                                                System.out.println("Enter Position employee: ");
                                                String position = input.nextLine();
                                                System.out.println("Enter address employee: ");
                                                String address = input.nextLine();
                                                System.out.println("Enter Contract employee: ");
                                                String contract = input.nextLine();

                                                Employee employee = new Employee(name, numberPhone, dateOfBirth, position, address, contract);
                                                E.add(employee);
                                                break;
                                            case "2":
                                                System.out.println("Enter numberPhone of employee you want remove: ");
                                                numberPhone = Integer.parseInt(input.nextLine());
                                                E.remove(numberPhone);
                                                break;
                                            case "3":
                                                System.out.println("Enter numberphone of employee you want edit: ");
                                                numberPhone = Integer.parseInt(input.nextLine());
                                                E.search(numberPhone);

                                                System.out.println("Enter edit name employee: ");
                                                name = input.nextLine();
                                                System.out.println("Enter update NumberPhone employee: ");
                                                numberPhone = Integer.parseInt(input.nextLine());
                                                System.out.println("Enter update Date of birth employee: ");
                                                dateOfBirth = input.nextLine();
                                                System.out.println("Enter update Position employee: ");
                                                position = input.nextLine();
                                                System.out.println("Enter update Contract employee: ");
                                                contract = input.nextLine();
                                                System.out.println("Enter update address employee: ");
                                                address = input.nextLine();

                                                employee = new Employee(name, numberPhone, dateOfBirth, position, address, contract);
                                                E.update(employee);
                                                break;
                                            case "4":
                                                System.out.println("Imformation of all employee: ");
                                                E.getAll();
                                                break;
                                            case "5":
                                                System.out.println("Enter numberPhone of employee: ");
                                                numberPhone = Integer.parseInt(input.nextLine());
                                                E.search(numberPhone);
                                                break;
                                            case "0":
                                                break startManager;
                                            default:
                                                break startControlEmployee;
                                        }
                                    }
                                } while (true);

                                //Quản lý sản phẩm
                            } else if (choice1.equals("3")) {
                                do {
                                    startControlProduct:
                                    {
                                        System.out.println("1. Add product.");
                                        System.out.println("2. Remove product. ");
                                        System.out.println("3. Edit profile product. ");
                                        System.out.println("4. Profile all product. ");
                                        System.out.println("0. Back. ");

                                        String choice11 = input.nextLine();

                                        switch (choice11) {
                                            case "1":
                                                break;
                                            case "2":
                                                break;
                                            case "3":
                                                break;
                                            case "4":
                                                break;
                                            case "0":
                                                break startManager;
                                            default:
                                                break startControlProduct;
                                        }
                                    }
                                } while (true);


                                //quản lý khach hàng
                            } else if (choice1.equals("4")) {
                                do {
                                    startControlCustumer:
                                    {
                                        System.out.println("1. Add custumer.");
                                        System.out.println("2. Remove custumer. ");
                                        System.out.println("3. Edit profile custumer. ");
                                        System.out.println("4. Profile all custumer. ");
                                        System.out.println("0. Back. ");

                                        String choice11 = input.nextLine();

                                        switch (choice11) {
                                            case "1":
                                                break;
                                            case "2":
                                                break;
                                            case "3":
                                                break;
                                            case "4":
                                                break;
                                            case "0":
                                                break startManager;
                                            default:
                                                break startControlCustumer;
                                        }
                                    }
                                } while (true);
                            } else if (choice1.equals("0")) {
                                break startApp;
                            }else break startManager;
                        }
                    } while (true);
                    //hết quyền truy cập của manager------------------------------


                    //quyền truy cập của employee---------------------------------
                }else if (access == 2){
                    System.out.println("chưa tạo gì");
                }
            }
        }while (true) ;
    }
}




