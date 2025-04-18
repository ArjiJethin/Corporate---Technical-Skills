public class Question4 {
    public static String makePalindrome(String input) {
        int n = input.length();
        String reversed = new StringBuilder(input).reverse().toString();

        // Find the longest palindromic suffix
        int maxSuffixLength = 0;
        for (int i = 0; i < n; i++) {
            if (input.substring(0, n - i).equals(reversed.substring(i))) {
                maxSuffixLength = n - i;
                break;
            }
        }

        // Add the necessary characters to the front
        String prefixToAdd = reversed.substring(0, n - maxSuffixLength);
        return prefixToAdd + input;
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = makePalindrome(input);
        System.out.println("Output: " + result);
    }
}