public class BasicMath4{
    public static void main(String[] args){
        int n=153;
        int dup=n;
        int lastdigit=0;
        int sum=0;
        while(n>0){
            lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        if(dup==sum){
            System.out.println("This is amstrong");
        }else{
         System.out.println("This is not a amstrong");
        }
    }
}