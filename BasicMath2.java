public class BasicMath2 {
    public static void main(String[] args) {
       int n=786;
       while (n>0) {
        n=n%10;
        System.out.println("The last digit is "+n);
        n=n/10;
       }
    }
}
