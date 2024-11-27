package recursion;

public class FindMaximumInArray {
    public static int findMax(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find the maximum between the last element and the maximum of the rest of the array
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 6, 10, 12};
        System.out.println(findMax(arr, arr.length)); // Output: 12
    }
}
