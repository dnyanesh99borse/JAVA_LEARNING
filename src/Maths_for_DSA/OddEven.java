
public class OddEven {

    public static void main(String[] args) {
        int n = 68;
        if (isOdd(n)) {
            System.out.println("Odd no");
        } else {
            System.out.println("Even no");
        }
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
