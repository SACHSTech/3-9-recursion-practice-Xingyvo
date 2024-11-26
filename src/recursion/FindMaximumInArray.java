package recursion;

public class FindMaximumInArray {
    public static int findMax(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }

        if (arr[n] > arr[n - 1]) {
            return arr[n];
        }

        return findMax(arr, n - 1); 
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 6};
        System.out.println(findMax(arr, 4)); // Output: 9
    }
}
