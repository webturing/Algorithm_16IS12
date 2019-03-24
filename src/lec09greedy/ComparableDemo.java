package lec09greedy;

import java.util.Arrays;

import java.util.Comparator;


public class ComparableDemo {

    static class Point implements Comparable<Point> {

        int x = 5, y = 5;

        @Override

        public int compareTo(Point that) {        //默認排序規則 按x增序

            return this.x - that.x;

        }

        @Override

        public String toString() {

            // TODO Auto-generated method stub

            return String.format("(%d,%d)", x, y);

        }

    }


    public static void main(String[] args) {

        Point[] points = new Point[10];

        for (int i = 0; i < points.length; i++) {

            points[i] = new Point();

            points[i].x = (int) (Math.random() * 10);

            points[i].y = (int) (Math.random() * 10);

        }

        System.out.println(Arrays.toString(points));

        Arrays.sort(points);

        System.out.println(Arrays.toString(points));

        final Point me = new Point();

        Arrays.sort(points, new Comparator<Point>() { //自定義排序

            @Override

            public int compare(Point pa, Point pb) {

                Double da = Math.hypot(pa.x - me.x, pa.y - me.y);

                Double db = Math.hypot(pb.x - me.x, pb.y - me.y);

                return da.compareTo(db);

            }


        });

        System.out.println(Arrays.toString(points));

    }

}