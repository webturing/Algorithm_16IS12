package lec15search;


import java.util.Arrays;

//深度优先搜索遍历全排列空间
public class PermDfs {
    static int n = 5;
    static int[] a = new int[n];
    static boolean[] vis = new boolean[n];

    static void dfs(int k) {
        if (k == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                a[k] = i + 1;
                vis[i] = true;
                dfs(k + 1);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
