
import java.util.*;

public class FindMissing {

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int xor = 0;
        //xor for 0...n
        for (int i = 0; i <= n; i++) { //i<=n cause we have to go from 0 to n..(n include)
            xor = xor ^ i;
        }
        //xor with array elements
        for (int x : arr) {
            xor = xor ^ x;
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing number is: " + missingNumber(arr));
    }
}
