public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(64, 84));
        System.out.println(lcm(126,70));

    }

    private static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }

    private static int gcd(int a, int b) {
        int result = 0;
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                }
            }

        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                }
            }

        }
        return result;
    }
}
