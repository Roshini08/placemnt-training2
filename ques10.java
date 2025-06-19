public class SqrtWithoutFunction {
    public int mySqrt(int x) {
        if (x < 2) return x;  // 0 and 1 are their own square roots

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To prevent overflow, cast to long before multiplication
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;        // Store the best candidate so far
                left = mid + 1;   // Try higher
            } else {
                right = mid - 1;  // Try lower
            }
        }

        return ans;  // Square root rounded down
    }

    public static void main(String[] args) {
        SqrtWithoutFunction sol = new SqrtWithoutFunction();
        System.out.println(sol.mySqrt(4)); // Output: 2
        System.out.println(sol.mySqrt(8)); // Output: 2
        System.out.println(sol.mySqrt(10)); // Output: 3
        System.out.println(sol.mySqrt(0)); // Output: 0
    }
}
