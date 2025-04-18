public class Question2 {
    public static String longestSubstringWithoutRepeating(String s) {
        int start = 0, maxLength = 0;
        String longestSubstring = "";
        boolean[] charPresent = new boolean[256]; // Array to track character presence

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Remove characters from the start until the duplicate is removed
            while (charPresent[currentChar]) {
                charPresent[s.charAt(start)] = false;
                start++;
            }

            // Mark the current character as present
            charPresent[currentChar] = true;

            // Update the longest substring if needed
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "abcabccbb";
        String result = longestSubstringWithoutRepeating(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}