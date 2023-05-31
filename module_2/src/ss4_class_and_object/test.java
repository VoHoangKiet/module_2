package ss4_class_and_object;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số : ");
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0) {
                System.out.println("Mời NHập lại");
            }
        } while (num < 0);
//      bước 2 :  Khai bao Array
        int[][] arr = new int[num][num];
//        Bước 3 : NHập phần tử mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Nhập phần tử mảng %d ", i);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
