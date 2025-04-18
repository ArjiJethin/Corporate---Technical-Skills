import java.util.ArrayList;
import java.util.List;

public class Question6 {

    // Method to generate all permutations of a string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        return result;
    }

    // Helper method to perform the permutation
    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    // Method to swap characters in a string
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String input = "ab";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations: " + String.join(", ", permutations));
    }
}