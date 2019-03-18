package lec05acm.babyTest;

import java.util.Arrays;
import java.util.Scanner;

class Pipe implements Comparable<Pipe> {
    int length;
    int diameter;
    int number;

    @Override
    public int compareTo(Pipe that) {
        int d = that.length - this.length;
        if (d != 0) return d;
        d = this.diameter - that.diameter;
        if (d != 0) return d;
        return that.number - this.number;
    }
}

/**
 * 2
 * 2
 * 2000 30 123456789
 * 2000 20 987654321
 * 4
 * 3000 50 872198442
 * 3000 45 752498124
 * 2000 60 765128742
 * 3000 45 652278122
 */
public class P03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int n = cin.nextInt();
            Pipe[] pipes = new Pipe[n];
            for (int i = 0; i < n; i++) {
                pipes[i] = new Pipe();
                pipes[i].length = cin.nextInt();
                pipes[i].diameter = cin.nextInt();
                pipes[i].number = cin.nextInt();
            }
            Arrays.sort(pipes);
            System.out.println(pipes[0].number);
        }
        cin.close();
    }
}
