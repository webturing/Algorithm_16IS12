package lec12midtest;

import java.util.Arrays;
import java.util.Scanner;

//评委会打分
public class B {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            double[] scores = new double[7];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = cin.nextDouble();
            }
            String name = cin.next();
            Arrays.sort(scores);
            double sum = 0;
            for (int i = 1; i <= scores.length - 2; i++) {
                sum += scores[i];
            }
            double avg = sum / 5.0;
            System.out.println(String.format("%s %.2f", name, avg));

        }

        cin.close();

    }
}
