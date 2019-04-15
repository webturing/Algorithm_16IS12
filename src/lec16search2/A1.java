package lec16search2;

public class A1 {
    final static int N = 100;

    public static void main(String[] args) {//O(N^3)
        for (int x = 0; x <= N / 5; x++)
            for (int y = 0; y <= N / 3; y++) {
                int z = N - x - y;
                if (5 * x + 3 * y + z / 2 == N) {
                    System.out.println(x + " " + y + " " + z);
                }
            }
    }
}
