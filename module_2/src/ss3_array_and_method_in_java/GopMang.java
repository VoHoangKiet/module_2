package ss3_array_and_method_in_java;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử mảng thứ nhất: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " trong mảng 1: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Nhập vào số lượng phần tử mảng thứ hai: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " trong mảng 2: ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] arr3 = new int[n + m];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        if (arr3.length - arr1.length >= 0)
            System.arraycopy(arr2, 0, arr3, arr1.length, arr3.length - arr1.length);
        System.out.println("Các phần tử trong mảng thứ ba là: ");
        for (int j : arr3) {
            System.out.print(j + " ");
        }
    }
}
