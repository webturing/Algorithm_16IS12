package lec18review;

import java.util.Arrays;
import java.util.Random;

public class LuckMoney2 {
    static Random random = new Random();

    static int randInt(int a, int b) {
        return random.nextInt(b - a + 1) + a;
    }

    /**
     * 红包模拟，改进算法，设 n 个人分 x红包 则每一个人的期望是x/n 第一次的区间是[1,2*[x/n]-1]
     *
     * @param cents
     * @param bags
     * @return
     */
    static int[] sendLuckyMoney(int cents, int bags) {
        if (cents < bags) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        int[] result = new int[bags];
        int avg = cents / bags;
        for (int i = 0; i < bags - 1; i++) {
            result[i] = randInt(1, 2 * avg - 1);
            cents -= result[i];
        }
        result[bags - 1] = cents;
        return result;

    }

    public static void main(String[] args) {
        int[] result = sendLuckyMoney(100, 5);
        System.out.println(Arrays.toString(result));
    }
}
