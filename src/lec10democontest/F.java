package lec10democontest;

import java.io.PrintWriter;
import java.util.Scanner;
//硬币找零
public class F {

    static final int B[] = {100, 50, 20, 10, 5, 2, 1};
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        for (int b : B) {
            for (int j = 0; j < n / b; j++)
                cout.println(b);
            n %= b;
        }


        cout.close();
        cin.close();
    }

}