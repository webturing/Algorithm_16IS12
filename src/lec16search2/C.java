package lec16search2;

import java.util.Scanner;

public class C {
    static int n;
    static int[] F;
    static int sum = 0;

    static void fill() {
        n = cin.nextInt();
        F = new int[n];
        sum = 0;
        for (int i = 0; i < n; i++) {
            F[i] = cin.nextInt();
            sum += F[i];
        }
    }

    static boolean dfs(int k, int m) {
        if (k == n) return m == 0;
        return dfs(k + 1, m) || dfs(k + 1, m - F[k]);
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            fill();
            if (sum % 2 != 0) {
                System.out.println("Sorry,I can't!");
            } else if (dfs(0, sum / 2)) {
                System.out.println("Of course,I can!");
            } else {
                System.out.println("Sorry,I can't!");
            }
        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);

}
