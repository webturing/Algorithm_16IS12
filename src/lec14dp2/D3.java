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
        fill(n);
        int tot = 0;
        for (int i = 0; i < primes.size() - 1 && primes.get(i) + 2 <= n; i++) {
            if (primes.get(i) + 2 >= primes.get(i + 1)) ++tot;
        }
        System.out.println(tot);
    }

    private static void fill(int n) {
        if (primes.lastElement() < n) {
            for (int k = primes.lastElement() + 2; k <= n; k += 2) {
                boolean flag = true;
                for (Integer p : primes) {
                    if (p * p > k) break;
                    if (k % p == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    primes.add(k);
                }
            }
        }
    }
}
