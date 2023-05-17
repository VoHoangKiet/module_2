package ss3_array_and_method_in_java;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n+1];
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Vui lòng nhập số cần chèn: ");
        int X = Integer.parseInt(scanner.nextLine());
        int index;
        do {
            System.out.print("Nhập vào vị trí index cần chèn vào trong mảng: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index <= 0 || index >= arr.length - 1) {
                System.out.println("Không được chèn phần tử vào mảng, Vui lòng nhập lại!");
            }
        } while (index <= 0 || index >= arr.length - 1);
        for (int i = arr.length-1; i >= index ; i--) {
            arr[i] = arr[i-1];
        }
            arr[index-1] = X;
        System.out.println("Các phần tử trong mảng sau khi thay đổi: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
