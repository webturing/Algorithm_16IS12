package lec14dp2;

public class A {
    final static int N = 1000000;
    final static long MOD = 998244353L;
    static long[] f = new long[N];

    static {
        f[1] = 1;
        f[2] = 2;
        f[3] = 4;
        for (int i = 4; i < f.length; i++) f[i] = (f[i - 1] + f[i - 2] + f[i - 3]) % MOD;
    }

    public static void main(String[] args) {
        System.out.println(f[3]);
        System.out.println(f[4]);
        System.out.println(f[5]);
    }
}
