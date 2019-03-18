package lec06api;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1234567890123123123123123123123123123123123123");
        System.out.println(a.pow(3));
        System.out.println(a.isProbablePrime(1));
    }
}
