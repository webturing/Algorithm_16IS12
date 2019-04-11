package lec10democontest;

import java.io.PrintWriter;
import java.util.Scanner;
//整除的末尾，直接枚举00-99然后打印即可
public class D {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            if (a == 0 && b == 0) break;
            boolean first = true;
            for (int k = 0; k < 100; k++) {
                if ((a * 100 + k) % b == 0) {
                    if (first)
                        first = false;
                    else
                        cout.print(" ");
                    cout.print(String.format("%02d", k));

                }
            }
            cout.println();
        }
        cout.close();
        cin.close();
    }
}
 