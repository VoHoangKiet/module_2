package ss1_introduction_to_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập giá trị USD: ");
        int money = scanner.nextInt();
        money *= 23000;
        System.out.println("Số tiền chuyển sang vnd là: " + money);
    }
}
