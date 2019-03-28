package lec10democontest;

import java.util.PriorityQueue;
import java.util.Scanner;
//优先级队列的使用，小顶堆的维护
public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
        while (n-- > 0) {
            Q.add(cin.nextInt());
        }
        int tot = 0;
        while (Q.size() > 1) {
            int y = Q.peek();
            Q.poll();
            int x = Q.peek();
            Q.poll();
            tot += x + y;
            Q.offer(x + y);
        }
        System.out.println(tot);
        cin.close();
    }
}