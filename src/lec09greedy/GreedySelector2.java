package lec09greedy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class GreedySelector2 {
    static class Item implements Comparable<Item> {
        int idx;
        int start;
        int end;
        boolean used = false;
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return String.format("%d[%d, %d]", idx, start, end);
        }

        @Override
        public int compareTo(Item item) {
            // TODO Auto-generated method stub
            return this.end - item.end;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("input.txt"));
        Vector<Item> items = new Vector<Item>();
        int size = cin.nextInt();
        while (size-- > 0) {
            // System.out.println(cin.nextLine());
            Item curItem = new Item();
            curItem.idx = cin.nextInt();
            curItem.start = cin.nextInt();
            curItem.end = cin.nextInt();
            // System.out.println(curItem);
            items.add(curItem);
        }
        // 排序
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        int solutionCount = 0;
        int used = 0;
        while (used < items.size()) {
            int start = 0;
            int tot = 0;
            for (Item item : items) {
                if (item.used == false && item.start >= start) {
                    System.out.print(item + " ");
                    ++tot;
                    start = item.end;
                    item.used = true;
                    ++used;
                }
            }
            System.out.println("Tot=" + tot);
            solutionCount++;
        }
        System.out.println("Solutions count is " + solutionCount);
        cin.close();
    }
}