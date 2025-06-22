public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28, sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        System.out.println(number + (sum == number ? " is" : " is not") + " a perfect number.");
    }
}
