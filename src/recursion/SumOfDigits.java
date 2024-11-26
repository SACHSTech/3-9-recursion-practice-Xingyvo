package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            // Base case: get the last digit
            return n;
        }

        // Recursive case: add the last digit with the next digit
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234)); // Output: 10
    }
}
