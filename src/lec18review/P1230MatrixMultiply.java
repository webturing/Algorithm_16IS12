package lec18review;

import java.util.Scanner;

public class P1230MatrixMultiply {
    static int[][] readMatrix(int row, int col) {
        int ans[][] = new int[row][col];
        for (int i = 0; i < row; i++) for (int j = 0; j < col; j++) ans[i][j] = cin.nextInt();
        return ans;
    }

    public static void main(String[] args) {

        int R = cin.nextInt();
        int[][] a = readMatrix(R, R);
        int[][] b = readMatrix(R, R);
        int[][] c = readMatrix(R, R);
        if (check(a, b, c))
            System.out.println("Yes");
        else System.out.println("No");

    }

    private static boolean check(int[][] a, int[][] b, int[][] c) {
        if (a[0].length != b.length) return false;
        if (a.length != c.length || b[0].length != c[0].length) return false;
        for (int i = 0; i < 50; i++) {
            int[] x = randVector(a[0].length);
            if (checkVector(mul(mul(x, a), b), mul(x, c))) return false;
        }
        return true;
    }

    private static boolean checkVector(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    private static int[] mul(int[] x, int[][] c) {
        int[] ans = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            for (int k = 0; k < c[0].length; k++)
                ans[i] += x[k] * c[i][k];
        }
        return ans;
    }

    private static int[] randVector(int length) {
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) ans[i] = (int) (Math.random() * 2);
        return ans;
    }

    static Scanner cin = new Scanner(System.in);
}
