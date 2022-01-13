public class SelectionSort {

    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        int i, j , minIndex;

        // arr[0...i) 是有序的; arr[i...n) 是无序的
        for (i = 0; i < arr.length; i++) {

            // 选择 arr[i...n) 中的最小值的索引
            minIndex = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }

            if (minIndex != i)
                swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
