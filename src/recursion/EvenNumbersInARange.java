package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        // Base case: If start is greater than end, stop the recursion
        if (start > end) {
            return;
        }
 
        // Check if the current number is even
        if (start % 2 == 0) {
            System.out.println(start); // Print the even number
        }

        // Recursive case: Move to the next number
        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        printEvens(2, 10); // Output: 2, 4, 6, 8, 10
    }
}
