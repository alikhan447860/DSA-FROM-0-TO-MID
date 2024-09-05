public class BasicMath2 {
    public static void main(String[] args) {
        int n=7789;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
