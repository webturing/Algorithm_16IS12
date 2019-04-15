package lec15search;

//深度优先搜索遍历子集空间
public class SubSetDfs {
    final static int n = 3;
    static int[] a = new int[n];
    static boolean[] vis = new boolean[n];

    static {
        for (int i = 0; i < n; i++) a[i] = i + 1;
    }

    static void dfs(int k) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                if (vis[i]) {
                    System.out.print(a[i]);
                }
            }
            System.out.println();
            return;
        }
        vis[k] = false;
        dfs(k + 1);
        vis[k] = true;
        dfs(k + 1);

    }

    public static void main(String[] args) {
        dfs(0);
    }


}
