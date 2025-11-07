
import java.util.*;

public class PalindromePhrase {

    public static boolean isPalindromePhrase(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            //skip non-alphanumeric
            if (!Character.isLetterOrDigit(c1)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(c2)) {
                right--;
                continue;
            }

            //Compare after converting to lower
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindromePhrase(input) ? "yes" : "No");
    }
}
