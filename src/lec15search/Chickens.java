package lec15search;

/**
 * 5 3 0.5
 * x+y+z=100
 * 5x+3y+z/2=100
 */
public class Chickens {
    final static int N = 1000;

    public static void main(String[] args) {//O(1/30*n^3)=>O(n^2)
        for (int x = 0; x <= N / 5; x++)
            for (int y = 0; y <= N / 3; y++) {
                int z = N - x - y;
                if (x + y + z == N && 5 * x + 3 * y + z / 2 == N && z % 2 == 0) {
                    System.out.println(String.format("%d %d %d", x, y, z));
                }
            }
    }

}
