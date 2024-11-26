package recursion;

public class FindMaximumInArray {
    public static int findMax(int[] arr, int n) {
        // Base case:
        if (n <= 0) {
            return 0;
        }

        // Determine the largest integer in the array
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        // Recursive case:
        return findMax(arr, n - 1); 
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 6, 10, 12};
        System.out.println(findMax(arr, 6)); // Output: 12
    }
}
