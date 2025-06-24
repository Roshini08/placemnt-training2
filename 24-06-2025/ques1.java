public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "java is awesome";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
