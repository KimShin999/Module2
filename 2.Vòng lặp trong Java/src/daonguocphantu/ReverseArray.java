package daonguocphantu;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //khai báo mảng
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

//        for (int a:array) {
//            System.out.print(a);
//        }

        //đảo ngược mảng
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0 && i <= j ; i++ , j--){
            int temp = 0;
            temp = array[i] ;
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.printf("%-20s%s","Element in array reversed: ", " ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}

