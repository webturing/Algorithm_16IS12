package lec16search2;

import java.util.*;

public class F {
    static int n = 8;
    static int[] a = new int[n];
    static boolean[] vis = new boolean[n];

    static {
        for (int i = 0; i < n; i++)
            a[i] = i;

    }

    static void dfs(int k) {
        if (k == n) {
            boolean flag = true;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (Math.abs(i - j) == Math.abs(a[i] - a[j])) flag = false;
            if (flag)
                System.out.println(String.format("%d%d%d%d%d%d%d%d", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7]));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                vis[i] = true;
                a[k] = i;
                dfs(k + 1);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }

    static Scanner cin = new Scanner(System.in);
}
