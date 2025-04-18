import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        boolean result = containsPalindromeSubstring(input);
        System.out.print("Contains palindrome substring of length > 3: " + result);
        sc.close();
    }

    public static boolean containsPalindromeSubstring(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 4; j <= n; j++) { // Substrings of length > 3
                if (isPalindrome(str.substring(i, j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}