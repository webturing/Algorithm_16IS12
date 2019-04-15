package lec15search;

//深度优先搜索遍历子集空间
public class DfsSubSet {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static {
        for (int i = 0; i < N; i++)
            a[i] = i + 1;
    }

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                if (visited[i])
                    System.out.print(a[i]);
            System.out.println();
            return;
        }
        visited[k] = true;
        dfs(k + 1);
        visited[k] = false;
        dfs(k + 1);
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
