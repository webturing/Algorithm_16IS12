package lec07ds;

import java.util.Arrays;
import java.util.TreeMap;

public class P1221 {
	public static void main(String[] args) {
		String clause = "To know everything? 'is' to know nothing.";
		String words[] = clause.toLowerCase().split("\\W+");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		TreeMap<String, Integer> map = new TreeMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				Integer freq = map.get(word);
				map.put(word, freq + 1);
			} else {
				map.put(word, 1);
			}

		}
		//System.out.println(map);
		for(String word:map.keySet())
			System.out.println(word+":"+map.get(word));
	}
}
