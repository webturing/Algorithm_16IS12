package lec05acm.babyTest;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            String s = cin.next();
            System.out.println(s);
        }
        cin.close();
    }
}
