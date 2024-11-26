package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        // Base case: if n is 0, stop
        if (n <= 0) {
            return 0;
        }

        // Recursive case: calls the method and adds the sums
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
