public class Solution {

    // 非递归实现二分查找法
    public static int search(int[] data, int target) {
        int l = 0, r = data.length - 1;

        // 在 data[l, r] 的范围中查找target
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (data[mid] == target)
                return mid;

            if (data[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }

    // 递归实现二分查找法
    public int searchR(int[] data, int target) {
        return searchR(data, 0, data.length - 1, target);
    }

    private static int searchR(int[] data, int l, int r, int target) {
        if (l > r)
            return -1;

        int mid = l + (r - l) / 2;

        if (data[mid] == target)
            return mid;

        if (data[mid] < target)
            return searchR(data, mid + 1, r, target);

        return searchR(data, l, mid - 1, target);
    }

}
