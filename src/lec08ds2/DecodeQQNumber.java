package lec08ds2;

import java.util.LinkedList;

public class DecodeQQNumber {
    public static void main(String[] args) {
        LinkedList<Integer> Q = new LinkedList<Integer>();
       int []a=new int[]{1, 12, 2, 8, 3, 11, 4, 9, 5, 13, 6, 10, 7};
       for(int i:a)Q.add(i);
        System.out.println(Q);
        while(!Q.isEmpty()){
            System.out.print(Q.peek()+" ");
            Q.poll();
            if(Q.isEmpty())continue;
            int x=Q.peek(); //获得队列第一个元素x
            Q.poll();    //删除x
            Q.add(x);//把x加入队列末尾
        }

    }
}
