public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int ans = findSmallest(nums);
        System.out.println("Smallest possible largest sum: " + ans);
    }

    // Finds the largest sum between left and right subarray for a split at mid
    static int findLargest(int[] nums, int start, int end, int mid) {
        int leftsum = 0;
        int rightsum = 0;

        // sum from start to mid-1
        for (int i = start; i < mid; i++) {
            leftsum += nums[i];
        }

        // sum from mid to end
        for (int i = mid; i <= end; i++) {
            rightsum += nums[i];
        }

        return Math.max(leftsum, rightsum);
    }

    // Binary search on the split index to minimize the largest sum
    static int findSmallest(int[] nums) {
        int start = 1;                // split cannot be before index 1
        int end = nums.length - 1;    // split cannot be after last index
        int smallest = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int largest = findLargest(nums, 0, nums.length - 1, mid);

            // Update smallest
            if (largest < smallest) {
                smallest = largest;
            }

            // Move binary search boundaries
            // Try moving split towards the side with larger sum
            int leftSum = 0, rightSum = 0;
            for (int i = 0; i < mid; i++) leftSum += nums[i];
            for (int i = mid; i < nums.length; i++) rightSum += nums[i];

            if (leftSum > rightSum) {
                // left side is heavier, so move split left
                end = mid - 1;
            } else {
                // right side is heavier, move split right
                start = mid + 1;
            }
        }

        return smallest;
    }
}
