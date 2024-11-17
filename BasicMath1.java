public class BasicMath1{
    public static void main(String[] args) {
        int n=7860;
        int count=0;
        int last=0;
        while (n>0) {
            last=n%10;
          count=count+1;
            n=n/10;
        }
        System.out.println("The total number of digit is "+count);
    }
}