package ss2_loop_in_java;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        int i = 0;
        while (i < 5) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            i++;
        }
        i--;
        System.out.println("");
        while (i >= 0) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            i--;
        }
    }
}
