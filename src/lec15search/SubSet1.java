package lec15search;

public class SubSet1 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < (1 << n); i++) {//2^n
            String str = Integer.toBinaryString(i);
            while (str.length() < n) str = "0" + str;
            System.out.println(str);
        }
    }
}
