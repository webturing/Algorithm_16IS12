package lec10democontest;

import java.util.Scanner;
//敲7 整数转String然后contains(substr)
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 || Integer.toString(i).contains("7"))
                ++s;
        }
        System.out.println(s);

        cin.close();
    }
}