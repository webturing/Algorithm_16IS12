package lec17prob;

/**
 * Created by webturing on 4/24/19.
 */
public class Doll {
    //赌轮转盘的程序实现
    static double p[] = new double[]{0.1, 0.2, 0.3, 0.4};//模拟一等奖概率为10% 二等奖概率为20% 三等奖概率为30%

    static void doll() {
        double k = Math.random();
        if (k <= p[0]) {
            System.out.println("FirstPrize");
        } else if (k <= p[0] + p[1]) {
            System.out.println("SecondPrize");
        } else if (k <= p[0] + p[1] + p[2]) {
            System.out.println("ThirdPrize");
        } else {
            System.out.println("Sorry");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            doll();
    }
}
