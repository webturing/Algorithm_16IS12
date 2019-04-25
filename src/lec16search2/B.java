package lec16search2;

import java.util.Scanner;

public class B {
    static int n = 10;
    static int[] F = new int[n];

    static {
        F[1] = 1;
        for (int i = 2; i < F.length; i++) F[i] = i * F[i - 1];
    }

    static boolean dfs(int k, int m) {
        if (m == 0) return true;
        if (k == n) return m == 0;
        return dfs(k + 1, m) || dfs(k + 1, m - F[k]);
    }

    public static void main(String[] args) {
        int T = cin.nextInt();
        while (T-- > 0) {
            if (dfs(1, cin.nextInt()))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);

}
