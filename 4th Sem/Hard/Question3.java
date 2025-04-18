import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        sc.close();
        String result = containsPalindromeSubstring(input);
        System.out.print("The longest palindrome substring is : " + result);

    }

    public static String containsPalindromeSubstring(String str) {
        int n = str.length();
        String res = "";
        int key = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isPalindrome(str.substring(i, j))) {
                    if (str.substring(i, j).length() > key) {
                        key = (str.substring(i, j)).length();
                        res = str.substring(i, j);
                    }
                }
            }
        }
        return res;
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