package lec17prob;

import java.util.Arrays;
import java.util.Random;

public class LuckMoney {
    static Random random = new Random();

    static int randInt(int a, int b) {
        return random.nextInt(b - a + 1) + a;
    }

    /**
     * 简单红包模拟，但是不够公平（体现在大家获得大包的概率不一样)
     * @param cents
     * @param bags
     * @return
     */
    static int[] sendLuckyMoney(int cents, int bags) {
        if (cents < bags) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        int[] result = new int[bags];

        for (int i = 0; i < bags - 1; i++) {
            result[i] =randInt(1,cents-(bags-i-1));
            cents -= result[i];
        }
        result[bags - 1] = cents;
        return result;

    }

    public static void main(String[] args) {
        int[] result = sendLuckyMoney(10, 5);
        System.out.println(Arrays.toString(result));
    }
}
