package findvalue;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        //khởi tạo khai báo mảng;
        String[] student = {"Minh","Quân","Lâm","Văn","Việt","Tuấn","Hưng","Tùng","Hùng","Quy","Nghĩa Bếu","Nghĩa Japan", "Dương"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's Student: ");
        String Input_name = scanner.nextLine();

        boolean IsExit = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(Input_name)){
                System.out.println("Position of the sutdents in the list "+ Input_name + " is: " + (i+1));
                IsExit = true;
                break;
            }
        }
        if (!IsExit){
            System.out.println("Not Found"+ Input_name + " in the list");
        }
    }
}
