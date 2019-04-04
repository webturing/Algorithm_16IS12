package lec10midtest;

import java.util.Scanner;

//星期几 （a+b)%7
public class A {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0) break;
            int c = (a + b) % 7;
            if (c == 0) c = 7;
            System.out.println(c);
        }
        cin.close();

    }
}
