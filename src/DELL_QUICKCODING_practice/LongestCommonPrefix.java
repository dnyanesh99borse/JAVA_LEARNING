import java.util.*;

public class LongestCommonPrefix{
    public static String longestcommonprefix(String[] strs){
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(String str : strs){
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] arr = new String[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextLine();
        System.out.println(longestcommonprefix(arr));
    }
}