package lec14dp2;

public class G {
    public static void main(String[] args) {
        int B[] = {1, 2, 4, 5, 10};
        int n = 108;
        int F[] = new int[n + 1];
        for (int i = 1; i < F.length; i++)
            F[i] = i;
        for (int i = 0; i < B.length; i++)
            F[B[i]] = 1;
        for (int i = 3; i < F.length; i++) {
            int m = F[i];
            for (int j = 0; j < B.length; j++) {
                if (i >= B[j])
                    m = Math.min(m, F[i - B[j]] + 1);
            }
            F[i] = m;
        }
        System.out.println(F[n]);

    }
}
