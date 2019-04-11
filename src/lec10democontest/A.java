package lec10democontest;

import java.util.Scanner;
//A+B
public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(a + b);
        cin.close();
    }
}