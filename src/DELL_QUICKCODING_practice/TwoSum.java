
import java.util.*;

public class TwoSum {

    public static int[] TwosumSol(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; //not found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int[] res = TwosumSol(arr, target);
        System.out.println("Output is: " + res[0] + " " + res[1]);
    }
}
