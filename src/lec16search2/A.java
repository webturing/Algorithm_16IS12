package lec16search2;

public class A {
    final static int N = 100;

    public static void main(String[] args) {//O(N^3)
        for (int x = 0; x <= N; x++)
            for (int y = 0; y <= N; y++)
                for (int z = 0; z <= N; z++) {
                    if (x + y + z == N && 5 * x + 3 * y + z / 2 == N && z % 2 == 0) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
    }
}
