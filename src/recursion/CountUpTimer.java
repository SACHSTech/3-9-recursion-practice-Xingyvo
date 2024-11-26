package recursion;

public class CountUpTimer {
    public static void countUp(int n) {
        // solution here
        if (n <= 0) {
            // Base case: stop when countdown reaches 0
            System.out.println("Countdown start!");
        } else {
            // Recursive case: call the method and then print the number
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countUp(5); // Output: 1 2 3 4 5
    }
}