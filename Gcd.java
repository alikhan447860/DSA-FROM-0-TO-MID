public class Gcd {
    public static void main(String[] args) {
        int a = 108, b = 36, c = 90;
        int gcd = 1;

        for (int i = 1; i <= a && i <= b && i <= c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD is: " + gcd);
    }
}
