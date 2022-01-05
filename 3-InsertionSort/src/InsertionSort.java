import java.util.Arrays;

/**
 * 插入排序法
 */
public class InsertionSort {

    private InsertionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 将 arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for (j = i - 1; j >= 0 && t.compareTo(arr[j]) < 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = t;
        }
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {

            System.out.println("Random Array : ");

            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);

            SortingHelper.sortTest("InsertionSort", arr);
            SortingHelper.sortTest("SelectionSort", arr2);

            System.out.println();

            System.out.println("Ordered Array : ");

            arr = ArrayGenerator.generateOrderArray(n);
            arr2 = Arrays.copyOf(arr, arr.length);

            SortingHelper.sortTest("InsertionSort", arr);
            SortingHelper.sortTest("SelectionSort", arr2);

            System.out.println();
        }
    }

}
