import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4, 1, 5, 7, 6, 8, 9, 0};
        System.out.println(Arrays.toString(new Main().insertSort(a)));
    }

    public int[] insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int t = arr[i];
            int j;
            for (j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                int r = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = r;
            }
        }
        return arr;
    }
}
