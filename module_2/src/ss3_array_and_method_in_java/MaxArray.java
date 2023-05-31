package ss3_array_and_method_in_java;

import java.util.Scanner;

public class MaxArray {
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
        AddCols.output(arr);
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng là: " + max);
    }
}
