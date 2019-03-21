package lec08ds2;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        int n = 6;
        Stack<Integer> S = new Stack<>();
        while (n > 0) {
            S.push(n % 2);
            n /= 2;
        }
        while (!S.empty()) {
            System.out.print(S.peek());
            S.pop();
        }
    }
}
