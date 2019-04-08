# 动态规划 Dynamic Programming

##递归/分治算法的缺点（重复子问题求解）
- 重复子问题会严重降低算法效率

### 例子
- fib(n)
- n!

```

public class Fractor1 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(10));
    }

    private static int factorial(int n) {
        return n<=1?1:factorial(n-1)*n;
    }
}

```
##动态规划的基本思想
- 利用存储来避免重复子问题的求解

### 打表方法（静态规划）
- 自底向上计算（递推代替递归)

```
public class Fractor2 {
    static int F[]=new int[12];

    static void fill(){
        F[0]=F[1]=1;
        for(int i=2;i<F.length;i++)
            F[i]=F[i-1]*i;
    }
    public static void main(String[] args) {
        fill();
        System.out.println(F[10]);
        System.out.println(F[10]);
    }

    private static int factorial(int n) {
        return n<=1?1:factorial(n-1)*n;
    }
}

```
### 动态规划
- 自顶向下递归
- 自下而上计算
- 利用查表来避免重复子问题的求解

### 例子

```
import java.util.Arrays;

public class Fractor3 {
    static int F[] = new int[12];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(F));
        factorial(7);
        System.out.println(Arrays.toString(F));
        factorial(5);
        System.out.println(Arrays.toString(F));
        factorial(11);
        System.out.println(Arrays.toString(F));
    }

    private static int factorial(int n) {
        if (F[n] != 0)//查询数组 避免重复子问题的求解
            return F[n];
        if (n <= 1)
            return F[n] = 1;//计算出及时写入存储
        return F[n] = factorial(n - 1) * n;//计算及时写入存储
    }
}

```



#典型题分析
## 质数判定
   - 简单函数法 O(n) //枚举[2,n-1]
   - O(sqrt(n))//枚举[2,sqrt(n)]
   - O(sqrt(n)/2)//枚举[2,sqrt(n)]中的奇数
   - O(1) //一次性打表 O(nlogn)
   - 概率算法 
## fib计算
## 数字三角形
## 矩阵乘法链
## 组合优化