package lec17prob;

import java.math.BigInteger;

public class FermatDemo {
    static BigInteger f(int n) {
        return new BigInteger("2").pow(1 << n).add(BigInteger.ONE);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            BigInteger f = f(i);
            System.out.println(f + " " + f.isProbablePrime(10));
        }
    }
}
