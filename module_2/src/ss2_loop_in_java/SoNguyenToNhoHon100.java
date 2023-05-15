package ss2_loop_in_java;

public class SoNguyenToNhoHon100 extends HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        for (int i = 2; i < 101 ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
