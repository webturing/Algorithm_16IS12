package lec08ds2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            Q.add(i);
        }
        while (!Q.isEmpty()) {
            System.out.print(Q.peek());
            Q.poll();
        }
    }
}
