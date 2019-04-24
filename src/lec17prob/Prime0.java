package lec17prob;

public class Prime0 {

    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < 9; i++) {
            t *= 10;
            int z = t + 7;
            System.out.println(z + " " + prime(z));
        }
    }

    private static boolean prime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int c = 3; c <= n / c; c += 2) {
            if (n % c == 0) return false;
        }
        return true;
    }
}
