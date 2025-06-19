import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            // %-15s => left-justified string in 15 spaces
            // %03d   => 3-digit integer with leading zeros
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

        scanner.close();
    }
}
