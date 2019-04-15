package lec15search;

//深度优先搜索遍历全排列空间
public class DfsPermutation {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i;
                dfs(k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
