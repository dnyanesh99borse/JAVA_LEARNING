
import java.util.*;

public class MoveZeroes {

    public static void movezeroes(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
                //we are writing like this cause its equal to:
                //arr[pos] = arr[i];
                //pos++;
            }
        }

        while (pos < arr.length) {
            arr[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        movezeroes(arr);
        System.out.print("the final array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
