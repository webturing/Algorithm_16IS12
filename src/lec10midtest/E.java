package lec10midtest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

//兵临城下 排序
//20
//5
//        1 3 5 7 9
public class E {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int S = cin.nextInt();
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        boolean win = false;
        int tot = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            S -= a[i];
            ++tot;
            if (S <= 0) {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println(tot);
        } else {
            System.out.println(-1);
        }
    }
}
