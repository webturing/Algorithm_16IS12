package lec17prob;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * Created by webturing on 4/24/19.
 */
public class Doll2 {
    //洗牌算法
    public static void main(String[] args) {
        List<Integer> balls = new Vector<>();
        for (int i = 1; i <= 15; i++) balls.add(i);
        System.out.println(balls);
        Collections.shuffle(balls);
        System.out.println(balls);
    }
}
