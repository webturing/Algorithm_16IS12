package lec08ds2;

import java.util.Stack;

public class BraceMatchChecker {
    public static void main(String[] args) {
        boolean flag = check("((()))()");
        System.out.println(flag);
    }

    private static boolean check(String s) {
        Stack<Character> S = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') S.push(c);
            else if (c == ')') {
                if (S.isEmpty()) return false;
                if (S.peek() != '(') return false;
                S.pop();
            }
        }
        return S.isEmpty();
    }
}
