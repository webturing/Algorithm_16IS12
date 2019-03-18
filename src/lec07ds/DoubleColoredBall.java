package lec07ds;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DoubleColoredBall {
	public static void main(String[] args) {
		Vector<Integer> balls = new Vector<Integer>();
		for (int i = 1; i <= 35; i++)
			balls.add(i);
		System.out.println(balls);
		Collections.shuffle(balls);
		System.out.println(balls);
		Vector<Integer> firstPrize = new Vector<Integer>();
		for (int i = 0; i < 7; i++)
			firstPrize.add(balls.get(i));
		System.out.println(firstPrize);
		for (int i = 0; i < 10000000; i++) {
			Collections.shuffle(balls);
			List<Integer> user = balls.subList(0, 7);
			// System.out.println(user);
			if (user.equals(firstPrize)) {
				System.out.println("5,000,000 RMB!");
			}

		}
	}
}
