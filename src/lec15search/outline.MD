2018-2019-2 《算法分析与设计》@16信息12 课程QQ群（778129369）
 课程资源网站(同步更新中)https://github.com/webturing/Algorithm_16IS12
# lec15 通用问题求解策略：搜索

## 万能的解法之搜索

- 解空间
  - 几何空间
  - 子集空间
  - 全排列空间
- 深度优先搜索DFS
- 广度优先搜索BFS

## 深度优先搜素dfs

## 利用dfs遍历子集空间

```Java
public class DfsDemo2 {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static {
        for (int i = 0; i < N; i++)
            a[i] = i + 1;
    }

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                if (visited[i])
                    System.out.print(a[i]);
            System.out.println();
            return;
        }
        visited[k] = true;
        dfs(k + 1);
        visited[k] = false;
        dfs(k + 1);
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
```



## 利用dfs遍历全排列空间

```Java
//深度优先搜索遍历全排列空间
public class DfsDemo1 {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i;
                dfs(k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
```
## 单调空间的二分搜索
- 二分查找
- 二分答案
# dfs应用
## 1.  选人。
###一个小组共五人，分别为A、B、C、D、E。现有一项任务，要他们中的3个人去完成。已知：（1）A、C不能都去；（2）B、C不能都不去；（3）如果C去了，D、E就只能去一个，且必须去一个；（4）B、C、D不能都去；（5）如果B去了，D、E就不能都去。编程找出此项任务该由哪三人去完成的所有组合。  
## 2  1~9分成1：2：3的三个3位数 
###将1到9 这九个数字分成三个3位数，分求第一个3位数，正好是第二个3位数的二倍，是第三个3位数的三倍。问应当怎样分法。
## 3  1~9组成三个3位的平方数 
### 将1、2、3、4、5、6、7、8、9九个数字分成三组，每个数字只能用一次，即每组三个数不允许有重复数字，也不许同其它组的三个数字重复，要求每组中的三位数都组成一个平方数。
## 4  九位累进可除数
### 求九位累进可除数。所谓九位累进可除数就是这样一个数：这个数用到1到9这九个数字组成，每个数字刚好只出现一次。这九个位数的前两位能被2整除，前三位能被3整除......前N位能被N整除，整个九位数能被9整除。
