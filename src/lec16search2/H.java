
package lec16search2;

import java.awt.*;
import java.util.*;
import java.util.Queue;

public class H {
    public static void main(String[] args) {
        int T = cin.nextInt();
        while (T-- > 0) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            Set<Point> points = new HashSet<>();
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    int tmp = cin.nextInt();
                    if (tmp == 1) points.add(new Point(i, j));
                }

            Queue<Point> Q = new LinkedList<>();
            int cnt = 0;
            while (!points.isEmpty()) {
                Q.add(points.iterator().next());
                points.remove(Q.peek());
                while (!Q.isEmpty()) {
                    Point p = Q.peek();
                    for (int dx = -1; dx <= 1; dx++)
                        for (int dy = -1; dy <= 1; dy++) {
                            if (dx == dy) continue;
                            Point q = new Point(p.x + dx, p.y + dy);
                            if (points.contains(q)) {
                                Q.add(q);
                                points.remove(q);
                            }
                        }
                    Q.poll();
                }
                ++cnt;
            }

            System.out.println(cnt);
        }
    }

    static Scanner cin = new Scanner(System.in);
}
