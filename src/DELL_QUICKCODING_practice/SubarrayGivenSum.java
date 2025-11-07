
//----------------THIS CODE IS FOR POSITIVE NUMER ONLY-----------------
import java.util.*;

// public class SubarrayGivenSum {
//     public static int[] subarraySumPositive(int[] arr, int target) {
//         int left = 0, sum = 0;
//         for (int right = 0; right < arr.length; right++) {
//             sum = sum + arr[right];
//             while (left <= right && sum > target) {
//                 sum = sum - arr[left];
//                 left++;
//             }
//             if (sum == target) {
//                 return new int[]{left, right};
//             }
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int[] res = subarraySumPositive(arr, target);
//         System.out.println("The Output is: " + res[0] + " " + res[1]);
//     }
// }
//----------THIS CODE IS FOR ALL GENERAL ONE.. (NEGATIVE ALLOWED)-----------
public class SubarrayGivenSum {

    public static int[] subarraySumNegative(int[] arr, int target) {
        Map<Integer, Integer> prefIndex = new HashMap<>();
        int sum = 0;
        prefIndex.put(0, -1); //prefix sum 0 at index -1.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (prefIndex.containsKey(sum - target)) {
                return new int[]{prefIndex.get(sum - target) + 1, i};
            }
            prefIndex.put(sum, i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = subarraySumNegative(arr, target);
        System.out.println("The Output is: " + res[0] + " " + res[1]);
    }

}
