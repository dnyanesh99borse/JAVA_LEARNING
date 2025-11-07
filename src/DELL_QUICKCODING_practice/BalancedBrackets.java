import java.util.*;

public class BalancedBrackets{
    public static Boolean isBalanced(String s){
        Deque<Character> st = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            //if opening bracket push into stack
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(!matches(top,c)) return false; //mismatch
            }else {
                return false;
            }
        }
        return st.isEmpty();
    }
        private static boolean matches(char open, char close){
            return (open == '(' && close == ')') ||
                   (open == '{' && close == '}') ||
                   (open == '[' && close == ']');
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets string: ");
        String s = sc.nextLine().trim();
        System.out.println(isBalanced(s) ? "True" : "False");
    }


}
