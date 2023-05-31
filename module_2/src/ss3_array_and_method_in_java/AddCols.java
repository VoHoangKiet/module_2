package ss3_array_and_method_in_java;

import java.util.Scanner;

public class AddCols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của mảng: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập vào phần tử thứ a[ " + i + " ][ " + j + " ]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Nhập vào số cột cần tính tổng: ");
        int cols = Integer.parseInt(scanner.nextLine());
        int S = 0;
        for (int[] ints : arr) {
            S += ints[cols-1];
        }
        System.out.println("Tổng các phần tử trong cột " + cols + " là: " + S);
        output(arr);
    }
    public static void output(int[][] arr) {
        System.out.println("Các phần tử trong mảng gồm: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}
