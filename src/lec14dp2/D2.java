package lec14dp2;

import java.util.Arrays;

//朴素筛法
public class D2 {
    static int N = 1000000 + 10;
    static boolean[] prime = new boolean[N];

    static {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= N; i++)
            if (prime[i]) for (int j = i * i; j < N; j += i) prime[j] = false;
    }

    public static void main(String[] args) {
        int n = 200;
        int tot = 0;
        if (n >= 3) tot++;//至少有2,3这一对,其他孪生素数间距必然是2,
        for (int a = 3; a + 2 <= n; a += 2) {
            int b = a + 2;
            if (prime[a] && prime[b]) ++tot;
        }
        System.out.println(tot);
    }
}
