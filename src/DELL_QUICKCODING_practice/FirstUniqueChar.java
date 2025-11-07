
import java.util.*;

public class FirstUniqueChar {

    public static int firstunique(String st) {
        int[] freq = new int[256];
        for (char c : st.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < st.length(); i++) {
            if (freq[st.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(firstunique(st));
    }
}
