package recursion;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Base case: If the string is empty or has only one character, it is a palindrome
        if (s == null || s.length() <= 1) {
            return true;
        }

        // Check if the first and last characters are the same
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false; // Not a palindrome if they differ
        }

        // Recursive case: Check the substring without the first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("madam")); // Output: true
    }
}
