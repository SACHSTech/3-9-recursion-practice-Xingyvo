package recursion;

public class ReverseAString {
    public static String reverse(String s) {
        // Base case: If the string is empty or has only one character, return it
        if (s.length() <= 1) {
            return s;
        }

        // Recursive case: Take the last character and append the result of reversing the rest of the string
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        String result = reverse("hello");
        System.out.println(result); // Output: "olleh"
    }
}
