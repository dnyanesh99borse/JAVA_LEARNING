public class RotationCountInRotSort {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};

        // Function to count how many times the array has been rotated
        int ans = RotationCount(arr);

        System.out.println("Total count of rotations: " + ans);
    }

    // This method returns the number of rotations in the sorted rotated array
    static int RotationCount(int[] arr) {
        int pivot = findPivot(arr);

        /*
         * Why use (pivot + 1) % arr.length?
         * ----------------------------------
         * - In a rotated sorted array, the rotation count is the index of the smallest element.
         * - Pivot is the index of the largest element.
         * - The smallest element comes just after the pivot.
         *   So, rotation count = pivot + 1.
         *
         * - We use % arr.length to handle the case where the array is not rotated at all.
         *   In that case, findPivot returns -1, and (-1 + 1) % arr.length = 0, which is correct.
         */
        return (pivot + 1) % arr.length;
    }

    // This method finds the index of the pivot (largest element) using binary search
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid element is greater than next element ⇒ mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid element is smaller than previous element ⇒ previous is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: left half is unsorted ⇒ pivot is in left half
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                // Case 4: pivot is in right half
                start = mid + 1;
            }
        }

        // If no pivot is found, the array is not rotated at all
        return -1;
    }
}
