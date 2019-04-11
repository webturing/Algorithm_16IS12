package lec14dp2;

//函数方法
public class D {
    static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int c = 3; c * c <= n; c += 2) if (n % c == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        int tot = 0;
        if (n >= 3) tot++;//至少有2,3这一对,其他孪生素数间距必然是2,
        for (int a = 3; a + 2 <= n; a += 2) {
            int b = a + 2;
            if (isPrime(a) && isPrime(b)) ++tot;
        }
        System.out.println(tot);
    }
}
