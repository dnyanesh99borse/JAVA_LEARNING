
import java.util.*;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The final output is: " + findDuplicate(arr));
    }
}
