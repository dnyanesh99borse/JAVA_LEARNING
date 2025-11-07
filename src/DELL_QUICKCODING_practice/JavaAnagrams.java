
import java.util.*;

//--------for strict condition.. NOT CASE SENSITIVE-----------
//     public static boolean areAnagrams(String a, String b) {
//         if (a == null || b == null) return false;
//         a = a.toLowerCase();
//         b = b.toLowerCase();
//         if (a.length() != b.length()) return false;
//         int[] freq = new int[26];
//         for (int i = 0; i < a.length(); i++) {
//             char ca = a.charAt(i), cb = b.charAt(i);
//             freq[ca - 'a']++;
//             freq[cb - 'a']--;
//         }
//         for (int x : freq) if (x != 0) return false;
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine().trim();
//         String b = sc.nextLine().trim();
//         System.out.println(areAnagrams(a, b) ? "Anagrams" : "Not Anagrams");
//     }
// }
//-----------------FOR CASE SENSITIVE-------------
public class JavaAnagrams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }
        for (int x : freq) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isAnagram(s, t));
    }
}
