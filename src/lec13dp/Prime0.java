package lec13dp;

public class Prime0 {
    public static void main(String[] args) {
        System.out.println("hello world");
        for (int n = 0; n <= 100; n++)
            if (isPrimer(n))
                System.out.print(n + " ");
    }

    private static boolean isPrimer(int n) {
        if (n == 2) return true;

        if (n <= 1 || n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }
}
