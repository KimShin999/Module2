package Findmax;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        //Khai báo mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("size dose not exceed 20");
            }
        }while (size > 20);

        //gán giá trị nhập vào từ bàn phím cho mảng
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter elenment" + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }

        //duyệt mảng
        System.out.printf("%-20s%s", "Elements in array: ", " ");
        for (int j =0; j < array.length; j++){
            System.out.print(array[j] + "\t");

        }

        //tìm max
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++){
            if (max < array[i]){
                max = array[i];
            }
            index += 1;
        }
        System.out.println("the largest prooerty value in the list is " + max + ", at position " + index);

    }
}
