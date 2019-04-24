package lec17prob;

public class DossPi {
    public static void main(String[] args) {
        int N = 1000;
        int M = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) ++M;
        }
        System.out.println(M);
        double pi = 4.0 * M / N;
    }
}
