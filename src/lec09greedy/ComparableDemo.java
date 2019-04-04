package lec09greedy;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;



public class ComparableDemo {
    static class Item {
        int id;
        int start;
        int end;
    }

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(new File("input.txt"));
        Vector<Item> items = new Vector<Item>();
        int n = cin.nextInt();
        while (n-- > 0) {
            Item item = new Item();
            item.id = cin.nextInt();
            item.start = cin.nextInt();
            item.end = cin.nextInt();
            items.add(item);
        }
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                int len1 = o1.end - o1.start;
                int len2 = o2.end - o2.start;
                return len1 - len2;
            }
        });
        for (Item item : items) {
            System.out.println(String.format("%d %d %d", item.id, item.start, item.end));
        }
        cin.close();
    }

}