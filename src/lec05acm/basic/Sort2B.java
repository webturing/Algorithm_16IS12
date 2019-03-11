package lec05acm.basic;

public class Sort2B {
    public static void main(String[] args) {
        int x = 4, y = 3;
        int min, max;

        min = x;
        if (y < min) min = y;
        max = x;
        if (y > max) max = y;

        System.out.println(String.format("%d %d", min, max));
    }
}