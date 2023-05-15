package ss2_loop_in_java;

public class HienThi20SoNguyenToDauTien {
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int cnt = 0, n = 2;
        while (cnt < 20) {
            if (isPrime(n)) {
                cnt++;
                System.out.println(n);
            }
            n++;
        }
    }
}
