package lec05acm.basic;

import java.util.Scanner;

public class Sort3B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        cin.close();
        int min, mid, max;
        //TODO
        min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        //a+b+c==min+mid+max
        mid = a + b + c - min - max;

        System.out.println(String.format("%d %d %d", min, mid, max));

    }
}
