
import java.util.*;

public class IntersectionTwoArray {

    public static int []intersection(int[] arr1, int[] arr2) {
        Set<Integer> s1 = new HashSet<>();
        for (int x : arr1) {
            s1.add(x);
        }
        Set<Integer> res = new HashSet<>();
        for (int x : arr2) {
            if (s1.contains(x)) {
                res.add(x);
            }
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for (int x : res) {
            ans[i++] = x; //ans[i] = x --> i++

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] out = intersection(a,b);
        for(int x: out) System.out.println("Ouput is: " + x + " ");
    }
}
