package lec14dp2;

public class H {
    static final int MOD = 100000007;

    public static void main(String[] args) {
        int[][] F = new int[1000 + 2][2];
        F[1][0] = 1;
        F[1][1] = 1;
        F[2][0] = 2;
        F[2][1] = 1;
        int n = 30;
        for (int i = 3; i <= n; i++) {
            F[i][0] = (F[i - 1][0] + F[i - 1][1]) % MOD;
            F[i][1] = F[i - 1][0];
        }
        System.out.println((F[n][0] + F[n][1]) % MOD);
    }
}
