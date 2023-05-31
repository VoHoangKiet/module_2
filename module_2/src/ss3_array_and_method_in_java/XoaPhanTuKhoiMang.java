package ss3_array_and_method_in_java;

import java.lang.reflect.Array;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        System.out.print("Enter a size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        System.out.println("");
        System.out.print("Nhập phần tử cần xóa: ");
        int element = scanner.nextInt();
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (element)) {
                for (int j = i; j < arr.length-1; j++) {
                        arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + element + " in the list.");
        }
        System.out.printf("%-20s%s", "Elements in array after delete: ", "");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
