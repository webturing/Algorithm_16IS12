package lec07ds;

import java.util.Arrays;

public class P1220a {
	public static void main(String[] args) {
		int a[] = { 1, 1, 6, 3, 3 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		int j = 0;
		b[0] = a[0];
		j++;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == b[j - 1])
				continue;
			b[j] = a[i];
			j++;
		}
		// System.out.println(Arrays.toString(b));
		for (int i = 0; i < j; i++)
			System.out.println(b[i]);
	}
}
