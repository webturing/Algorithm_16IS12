package lec13dp;

public class Fib {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            long start = System.currentTimeMillis();//1970 1 1 0:0:0
            fib(i);
            long end = System.currentTimeMillis();
            System.out.println(String.format("T(%d): %.3f", i, (end - start) / 1000.0));
        }
    }


    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
