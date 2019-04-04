package lec09greedy;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;


public class GreedySelector {
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
                return o1.end - o2.end;
            }
        });
        int tot = 0;
        int start = 0;
        for (Item item : items) {
            if (item.start >= start) {
                ++tot;
                start = item.end;
                System.out.println(String.format("%d %d %d", item.id, item.start, item.end));
            }
        }
        System.out.println(tot);
        cin.close();
    }

}