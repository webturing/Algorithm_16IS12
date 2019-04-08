package lec13dp;

import java.util.Arrays;

public class Fib1 {
    static int[] F = new int[50];

    static int fib(int n) {
        if (F[n] != 0)
            return F[n];
        if (n <= 1) return F[n] = n;
        return F[n] = fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(F));
        fib(5);//
        System.out.println(Arrays.toString(F));
    }

}
