package lec06api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(Math.pow(1.01, 365));
        System.out.println(Math.pow(0.99, 365));
        BigDecimal b = new BigDecimal("1.01");
        System.out.println(b.pow(365));
        System.out.println(new BigDecimal("1").divide(new BigDecimal("80")));
        System.out.println(new BigDecimal("1").divide(new BigDecimal("7"), 100, BigDecimal.ROUND_DOWN));
    }
}
