import java.util.Scanner;

public class G {
    static int n = 5;
    static int r = 3;
    static int[] a = new int[n + 1];
    static boolean[] vis = new boolean[n + 1];

    static void fill() {
        n = cin.nextInt();
        r = cin.nextInt();
        a = new int[n + 1];
        vis = new boolean[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = i;

    }

    static void dfs(int k) {
        if (k > r) {
            for (int i = 1; i <= r; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = n; i >= 1; i--) {
            if (!vis[i]) {
                if (k > 1 && a[k - 1] < i) continue;
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

    static Scanner cin = new Scanner(System.in);
}
