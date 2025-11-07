import java.util.*;

public class CountingValley{
    public static int countingvalley(int n , String strs){
        int level = 0, valleys = 0;
        for(char c: strs.toCharArray()){
            if(c == 'U'){
                level++;
                if(level == 0) valleys++; //just came up to see from valley..mean valley completed
            }else if(c == 'D'){
                level--;
            }
        }
        return valleys;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String strs = sc.nextLine().trim();
        System.out.println(countingvalley(n,strs));
    }
}