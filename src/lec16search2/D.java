package lec16search2;

import java.util.Scanner;

public class D {
    static int n = 2;

    static int[] a = new int[n + 1];
    static boolean[] vis = new boolean[n + 1];
    static Scanner cin = new Scanner(System.in);

    static void fill() {
        n = cin.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = i;
        vis = new boolean[n + 1];
    }

    static void dfs(int k) {
        if (k > n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                vis[i] = true;
                a[k] = i;
                dfs(k + 1);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        fill();
        dfs(1);
    }
}
