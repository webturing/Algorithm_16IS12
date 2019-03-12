package lec05acm.basic;

public class Sort2 {
    public static void main(String[] args) {
        int x = 4, y = 3;
        if (x > y) {
            int t;
            t = x;
            x = y;
            y = t;
        }

        System.out.println(String.format("%d %d", x, y));
    }
}