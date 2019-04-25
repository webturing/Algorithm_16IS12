package lec18review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by webturing on 4/25/19.
 */
public class TSPDemo {
    static int n = 4;
    static int D[][] = new int[][]{{0, 30, 6, 4,}, {30, 0, 5, 10,}, {6, 5, 0, 20}, {4, 10, 20, 0}};

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) numbers.add(i);
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < 1000; i++) {
            Collections.shuffle(numbers);
            int cur = cost(numbers);
            if (cur < best) {
                // System.out.print(numbers+" ");
                best = cur;

            }

        }
        System.out.println(best);
    }

    private static int cost(List<Integer> numbers) {
        int tot = 0;
        for (int i = 0; i < n; i++)
            tot += D[numbers.get(i)][numbers.get((i + 1) % numbers.size())];
        return tot;
    }
}



