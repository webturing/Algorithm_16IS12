package lec10midtest;

import java.util.Scanner;
import java.util.Vector;

//n!的因子数
//lucas n! 素数p的质数=[n/p]+[n/p^2]+.....+[n/p^inf]
public class G {
    static Scanner cin = new Scanner(System.in);
    static Vector<Integer> primes = new Vector<>();

    static {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        for (int i = 11; i <= 100; i += 2) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(primes);
        int n = cin.nextInt();
        long tot = 1;
        for (Integer p : primes) {
            int t = p;
            int s = 0;
            while (t <= n) {
                s += n / t;
                t *= p;
            }
            tot *= (s + 1);
        }
        System.out.println(tot);
    }
}
