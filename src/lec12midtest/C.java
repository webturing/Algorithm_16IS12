package lec12midtest;

import java.util.Scanner;

//大数转二进制
public class C {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            System.out.println(cin.nextBigInteger().toString(2));
        }

    }
}
