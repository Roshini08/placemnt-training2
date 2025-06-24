public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; 
        int len = arr.length;
        int[] rotated = new int[len];

        for (int i = 0; i < len; i++) {
            rotated[(i + n) % len] = arr[i];
        }
        for (int num : rotated) System.out.print(num + " ");
    }
}
