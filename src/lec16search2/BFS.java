
package lec16search2;

import java.awt.*;
import java.util.*;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        /**1 1 1
         * 1 1 1
         * 1 1 1
         *
         */
        Set<Point> S = new HashSet<Point>();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                S.add(new Point(i, j));
        System.out.println(S.size());
        Queue<Point> Q = new LinkedList<>();
        Iterator<Point> it = S.iterator();
        Point q = it.next();
        Q.offer(q);
        S.remove(q);
        System.out.println(S.size());
        System.out.println(Q);
        while (!Q.isEmpty()) {
            Point p = Q.peek();
            int x = p.x, y = p.y;
            Point up = new Point(x - 1, y);
            Point down = new Point(x + 1, y);
            Point left = new Point(x, y - 1);
            Point right = new Point(x, y + 1);
            if (S.contains(up)) {
                Q.offer(up);
                S.remove(up);
            }
            if (S.contains(right)) {
                Q.offer(right);
                S.remove(right);
            }
            if (S.contains(down)) {
                Q.offer(down);
                S.remove(down);
            }
            if (S.contains(left)) {
                Q.offer(left);
                S.remove(left);
            }

            Q.poll();
            System.out.println(p);
        }
    }

    static Scanner cin = new Scanner(System.in);
}
