public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == key) return mid;
        else if (arr[mid] > key)
            return binarySearch(arr, left, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int index = binarySearch(arr, 0, arr.length - 1, 8);
        System.out.println("Found at index: " + index);
    }
}
