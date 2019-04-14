package lec14dp2;

public class C0Cube {
    public static void main(String[] args) {
        int n = 100005;
        long start = System.currentTimeMillis();
        solve(n);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    static void solve(int n) {//O(n^3)
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                int s = 0;
                for (int k = a; k <= b; k++) {
                    s += k;
                }
                if (s == n) {
                    System.out.println(String.format("%d %d", a, b));
                }
            }
        }
    }
}
