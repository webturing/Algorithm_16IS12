package lec14dp2;

public class E {
    public static void main(String[] args) {
        int N = 5;
        int[] a = new int[]{1, 2, -1, 3, -2};
        int[] S = new int[N + 1];
        S[0] = a[0];
        for (int i = 1; i < N; i++)
            S[i] = S[i - 1] + a[i];
        int max = 0, min = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] > max) max = S[i];
            if (S[i] < min) min = S[i];
        }
        System.out.println(max - min);
    }
}
