package lec16search2;

import java.util.Scanner;

public class F2 {
    static int n = 8;
    static int[] a = new int[n];
    static boolean[] vis = new boolean[n];

    static {
        for (int i = 0; i < n; i++)
            a[i] = i;

    }

    static void dfs(int k) {
        if (k == n) {
            System.out.println(String.format("%d%d%d%d%d%d%d%d", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7]));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (k >= 1) {
                    boolean flag = true;
                    for (int j = 0; j <= k - 1; j++)
                        if (Math.abs(a[j] - i) == Math.abs(j - k)) {
                            flag = false;
                            break;
                        }
                    if (!flag) continue;
                }
                vis[i] = true;
                a[k] = i;
                dfs(k + 1);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        dfs(0);
        //System.out.println(System.currentTimeMillis() - start);
    }

    // static Scanner cin = new Scanner(System.in);
}
