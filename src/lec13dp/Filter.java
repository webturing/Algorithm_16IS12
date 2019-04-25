package lec13dp;

import java.util.Arrays;

public class Filter {
    static final int MAXN = 100;
    static boolean prime[] = new boolean[MAXN + 1];

    static {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= MAXN; i++)
            if (prime[i]) for (int j = i * i; j < prime.length; j += i)
                prime[j] = false;
    }

    public static void main(String[] args) {
        System.out.println("hell world");
        for (int n = 0; n <= 100; n++)
            if (prime[n])
                System.out.print(n + " ");
    }

}
