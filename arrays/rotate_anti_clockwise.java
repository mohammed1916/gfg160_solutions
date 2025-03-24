import java.util.Arrays;

public class RotateArrayLeft {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        
        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);
        // Step 2: Reverse the remaining elements
        reverse(arr, d, n - 1);
        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        
        rotateLeft(arr, d);
        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]
    }
}

"""
Explanation with Example (arr = [1, 2, 3, 4, 5], d = 2):
Reverse [1, 2] → [2, 1, 3, 4, 5]

Reverse [3, 4, 5] → [2, 1, 5, 4, 3]

Reverse the entire array → [3, 4, 5, 1, 2]
"""