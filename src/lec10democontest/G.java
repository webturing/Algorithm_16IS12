package lec10democontest;

import java.io.PrintWriter;
import java.util.Scanner;
//找零II基本上和一一样，
public class G {
    final static int B[] = {100, 50, 10, 5, 2, 1};
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int f(int n) {
        int tot = 0;
        for (int b : B) {
            tot += n / b;
            n %= b;
        }
        return tot;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            int tot = 0;
            for (int i = 0; i < n; i++) tot += f(cin.nextInt());
            cout.println(tot);
        }

        cout.close();
        cin.close();
    }
}