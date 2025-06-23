public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Beautiful Day";
        String result = input.replaceAll("(?i)[aeiou]", "");
        System.out.println("After removing vowels: " + result);
    }
}
