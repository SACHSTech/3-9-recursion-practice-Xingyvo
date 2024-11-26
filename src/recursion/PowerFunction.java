package recursion;

public class PowerFunction {
    public static int power(int base, int exponent) {
        if (exponent <= 0) {
            // Base case: if exponent equals 0, return 1
            return 1;
        }

        // Recursive case: multiply the base by the result of the last method called
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,4)); // Output: 16
    }
}
