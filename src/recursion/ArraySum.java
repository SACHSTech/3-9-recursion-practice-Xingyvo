package recursion;

public class ArraySum {
    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            // Base case: when n = 0, stop recursion
            return 0; 
        }

        // Recursive case: sum the current element with the rest
        return arr[arr.length - n] + sumArray(arr, n - 1); 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(sumArray(arr, 4)); // Output: 10
    }

    // return 1 + sumArray(arr, 3) 1 + 9 = 10

    // return 2 + sumArray(arr, 2) 2 + 7 = 9

    // return 3 + sumArray(arr, 1) 3 + 4 =7

    // return 4 + sumArray(arr, 0) 4 + 0 = 4

    // sumArray(arr, 0)returns 0
}
