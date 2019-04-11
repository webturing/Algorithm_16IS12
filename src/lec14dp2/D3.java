package lec14dp2;

import java.util.Vector;

//高级筛法
public class D3 {
    static Vector<Integer> primes = new Vector<>();

    static {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
    }

    public static void main(String[] args) {
        int n = 20;
        if (primes.lastElement() < n) {
            for (int k = primes.lastElement() + 2; k <= n; k += 2) {
                boolean flag = true;
                for (Integer p : primes)
                    if (p * p <= k && k % p == 0) {
                        flag = false;
                        break;
                    }
                if (flag) {
                    primes.add(k);
                }
            }
        }
        System.out.println(primes);
    }
}
