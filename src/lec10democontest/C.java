package lec10democontest;

import java.util.Scanner;
import java.util.TreeSet;
//排序去重首选TreeSet
public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        TreeSet<Integer> S = new TreeSet<Integer>();
        while (n-- > 0) {
            S.add(cin.nextInt());
        }
        System.out.println(S.size());
        for (Integer i : S)
            System.out.print(i + " ");
        System.out.println();
        cin.close();
    }
}