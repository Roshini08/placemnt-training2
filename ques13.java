public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne sol = new PlusOne();

        int[] input1 = {1, 2, 3};
        int[] result1 = sol.plusOne(input1);
        printArray(result1);  
        int[] input2 = {4, 3, 2, 1};
        int[] result2 = sol.plusOne(input2);
        printArray(result2);

        int[] input3 = {9, 9, 9};
        int[] result3 = sol.plusOne(input3);
        printArray(result3);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}

      
