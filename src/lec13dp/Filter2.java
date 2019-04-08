package lec13dp;

import java.util.Arrays;
import java.util.Vector;

public class Filter2 {

    static Vector<Integer> primers = new Vector<>();

    static {
        primers.addAll(Arrays.asList(new Integer[]{2, 3, 5, 7,}));
    }

    static void fill(int n) {
        if (primers.lastElement() >= n)
            return;
        for (int i = primers.lastElement() + 2; i <= n; i += 2) {
            boolean flag = true;
            for (int p : primers) {
                if (p * p > i)
                    break;
                if (i % p == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                primers.add(i);

        }
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 10000000; i += i) {//7%的素数比例
            fill(i);
            System.out.printf("%.3f\n", primers.size() * 100.0 / primers.lastElement());
        }
    }
}
