
import java.util.*;

public class MergeSortedArray {

    public static void MergeSort(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes
        System.out.print("Enter m (elements in arr1): ");
        int m = sc.nextInt();
        System.out.print("Enter n (elements in arr2): ");
        int n = sc.nextInt();

        int[] arr1 = new int[m + n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + m + " sorted elements of arr1:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " sorted elements of arr2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge the arrays
        MergeSort(arr1, m, arr2, n);

        // Output result
        System.out.println("Merged Sorted Array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
