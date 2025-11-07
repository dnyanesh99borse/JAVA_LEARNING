
import java.util.*;
//---------------------MY LOGIC---------------------------------------

// public class SalesByMatch {
//     public static int SalesMatch(int n, int[] arr) {
//         int count = 0, total = 0;
//         if (arr.length == 0) {
//             return 0;
//         }
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             if (map.containsKey(arr[i])) {
//                 continue;
//             }
//             for (int j = i; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             int pair = count / 2;
//             total = total + pair;
//             count = 0;
//             map.put(arr[i], i);
//         }
//         return total;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Output is: " + SalesMatch(n, arr));
//     }
// }
//--------------OPTIMIZED LOGIC------------------
public class SalesByMatch {

    public static int sockMerchant(int n, int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int pairs = 0;
        for (int v : freq.values()) {
            pairs += v / 2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output is: " + sockMerchant(n, arr));
    }
}
