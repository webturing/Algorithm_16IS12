package lec18review;

import java.util.Arrays;

/**
 * Created by webturing on 4/25/19.
 */
public class PrimersCycle {
    final static int n = 20;
    static int a[] = new int[n + 1];
    static boolean v[] = new boolean[n + 1];
    static boolean find=false;

    public static void main(String[] args) {
        a[1] = 1;
        if(n%2==0)
        dfs(2);
    }

    private static void dfs(int k) {
        if(find)return;
        if (k > n) {
            if (isPrime(a[n] + a[1])) {
                for (int i = 1; i <= n; i++)
                    System.out.print(a[i]+" ");
                System.out.println();
                find=true;
            }
            return;
        }
        for (int i = 2; i <= n; i++) {
            if (!v[i]) {
                if (i > 1 && !isPrime(i + a[k - 1])) continue;
                a[k] = i;
                v[i] = true;
                dfs(k + 1);
                v[i] = false;
            }
        }

    }

    static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int c = 3; c <= n / c; c += 2) if (n % c == 0) return false;
        return true;
    }
}
