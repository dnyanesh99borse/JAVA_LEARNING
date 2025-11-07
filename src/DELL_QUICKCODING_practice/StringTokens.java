
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        if (sc.hasNextLine()) {
            s = sc.nextLine();
        }
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        //separate the words
        String[] tokens = s.split("[^A-Za-z]+");
        //add only the words into the list and not the spaces...
        List<String> out = new ArrayList<>();
        for (String t : tokens) {
            if (!t.isEmpty()) {
                out.add(t);
            }
        }
        System.out.println(out.size());
        for (String t : out) {
            System.out.println(t);
        }
    }
}
