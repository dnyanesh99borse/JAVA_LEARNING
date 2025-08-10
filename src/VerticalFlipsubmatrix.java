import java.util.Arrays;

public class VerticalFlipsubmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int x = 1; // starting row of submatrix
        int y = 0; // starting column of submatrix
        int k = 3; // size of square submatrix

        flipArray(arr, x, y, k);

        // Print updated matrix
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void flipArray(int[][] arr, int x, int y, int k) {
        int top = x;
        int bottom = x + k - 1;

        while (top < bottom) {
            // Store top row's part in temp
            int[] temp = new int[k];
            System.arraycopy(arr[top], y, temp, 0, k);

            // Copy bottom row's part into top row
            System.arraycopy(arr[bottom], y, arr[top], y, k);

            // Copy temp into bottom row
            System.arraycopy(temp, 0, arr[bottom], y, k);

            // Move inward
            top++;
            bottom--;
        }
    }
}
