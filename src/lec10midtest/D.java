package lec10midtest;

import java.util.Scanner;
import java.util.Vector;

//通话记录 基础集合操作
public class D {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Vector<String> missed = new Vector<>();
        Vector<String> recieved = new Vector<>();
        Vector<String> dialed = new Vector<>();
        while (cin.hasNext()) {
            int type = cin.nextInt();
            String number = cin.next();
            if (type == 0) missed.add(number);
            else if (type == 1) recieved.add(number);
            else if (type == 2) dialed.add(number);
        }
        int max = 10;
        max = Math.max(missed.size(), max);
        max = Math.max(recieved.size(), max);
        max = Math.max(dialed.size(), max);
        while (missed.size() < max) missed.add("0");
        while (recieved.size() < max) recieved.add("0");
        while (dialed.size() < max) dialed.add("0");
        for (int i = 0; i < max; i++) {
            System.out.println(String.format("%s %s %s", missed.get(i), recieved.get(i), dialed.get(i)));
        }
    }
}
