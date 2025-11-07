import java.util.*;
public class ClosestNumber{
    public static String closestnumbers(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n < 2) return "";
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i -  1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<n; i++){
            if(arr[i] - arr[i-1] == minDiff){
                sb.append(arr[i - 1]).append(" ").append(arr[i]).append("");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println("Output: " + closestnumbers(arr));
    }
}