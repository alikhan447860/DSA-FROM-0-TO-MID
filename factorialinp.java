import java.util.Scanner;

public class factorialinp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of:");
        int n = sc.nextInt();
        
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
