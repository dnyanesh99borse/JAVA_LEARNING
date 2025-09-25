package Strings;

public class RotateString {
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab"; //should return true
        boolean result = Rotate(s,goal);
        System.out.println(result);
    }

     static boolean Rotate(String s, String goal){
        return s.length() == goal.length() && (s+s).contains(goal);
    }
}
