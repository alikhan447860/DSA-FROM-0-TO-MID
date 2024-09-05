public class BasicMath1{
    public static void main(String[] args) {
        int n=7789;
        int count=0;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            System.out.println(lastdigit);
            count=count+1;
            n=n/10;
        }
        System.out.println("The total number of digit is "+count);
    }
}