//public class FindMedianSortedArrays {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//
//        // Example test cases
//        int[] nums1 = {1, 3};
//        int[] nums2 = {2};
//
//        double median = sol.findMedianSortedArrays(nums1, nums2);
//        System.out.println("Median: " + median); // Expected output: 2.0
//
//        int[] nums3 = {1, 2};
//        int[] nums4 = {3, 4};
//
//        double median2 = sol.findMedianSortedArrays(nums3, nums4);
//        System.out.println("Median: " + median2); // Expected output: 2.5
//    }
//
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        // Always make nums1 the smaller array for efficiency
//        if (nums1.length > nums2.length) {
//            return findMedianSortedArrays(nums2, nums1);
//        }
//
//        int m = nums1.length;
//        int n = nums2.length;
//        int totalLeft = (m + n + 1) / 2;
//
//        int left = 0;
//        int right = m;
//
//        while (left <= right) {
//            int partitionA = (left + right) / 2;
//            int partitionB = totalLeft - partitionA;
//
//            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
//            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : nums1[partitionA];
//
//            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
//            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : nums2[partitionB];
//
//            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
//                // Found correct partition
//                if ((m + n) % 2 == 0) {
//                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
//                } else {
//                    return Math.max(maxLeftA, maxLeftB);
//                }
//            } else if (maxLeftA > minRightB) {
//                // Too far right in nums1, move left
//                right = partitionA - 1;
//            } else {
//                // Too far left in nums1, move right
//                left = partitionA + 1;
//            }
//        }
//
//        throw new IllegalArgumentException("Input arrays are not sorted or valid.");
//    }
//}
//}