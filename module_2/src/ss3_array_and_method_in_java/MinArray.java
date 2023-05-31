package ss3_array_and_method_in_java;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        System.out.print("Enter a size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j : arr) {
            if (j <= 0) {
                min = j;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
