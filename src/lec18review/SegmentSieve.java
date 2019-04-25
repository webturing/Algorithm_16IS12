package lec18review;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentSieve {

    static boolean[] small;
    static boolean[] large;

    static void seive(int l, int r) {
        int t = (int) Math.sqrt(r);
        small = new boolean[t + 5];
        large = new boolean[Math.max(r - l + 1, 2)];
        Arrays.fill(small, true);
        Arrays.fill(large, true);
        for (int i = 2; i <= t; i++)
            if (small[i]) {
                for (int j = 2 * i; j <= t; j += i)
                    small[j] = false;
                for (int j = Math.max(2, (l + i - 1) / i) * i; j <= r; j += i)
                    large[j - l] = false;
            }
    }

    public static void main(String[] args) {

        int sum = 0;
        int a = cin.nextInt(), b = cin.nextInt();
        seive(a, b);
        for (int i = a; i <= b; i++) if (large[i - a]) ++sum;
        System.out.println(sum);
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}
