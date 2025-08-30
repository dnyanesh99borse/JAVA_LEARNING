package Strings;

public class FirstUniqueChar {
    public static void main(String[] args){
//        String s = "leetcode";
//        String s = "aabb";
        String s = "loveleetcode";
        int ans = uniqueChar(s);
        System.out.println("Output: "+ ans);
    }

    public static int uniqueChar(String s){
        for(int i = 0; i <= s.length() -1; i++){
            boolean output = true;
            for(int j = i+1; j <= s.length()-1; j++){
                if(s.charAt(i) == s.charAt(j)){
                    output = false;
                    break;
                }
            }
            //if this cond. means output is still true cause no element is equal to this ith element
            //means this is unique element and hence true then return i(index)
            if(output) return i;
        }
        return -1;
    }
}
