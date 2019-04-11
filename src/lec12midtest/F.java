package lec12midtest;

import java.util.Scanner;

//自然数分解成两个合数 SPJ
public class F {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            if (n % 2 == 0) {
                System.out.println(String.format("%d %d", n - 4, 4));
            } else {
                System.out.println(String.format("%d %d", 9, n - 9));
            }
        }
    }
}
