public class NoTeenSum {

    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));    // Output: 6
        System.out.println(noTeenSum(2, 13, 1));   // Output: 3
        System.out.println(noTeenSum(2, 1, 14));   // Output: 3
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        } else {
            return n;
        }
    }
}
