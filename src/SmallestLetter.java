public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'}; // ✅ use single quotes for char
        char target = 'f';               // ✅ use single quotes for char

        char result = nextGreatestLetter(letters, target);
        System.out.println(result);      // Optional: print the result
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // ✅ Handles wrap-around if no letter is greater than target
        return letters[start % letters.length];
    }
}
