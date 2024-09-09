import java.util.*;
public class Powerinp {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number thaat you want power of it");
       int n=sc.nextInt();
       int ans=power(n);
       System.out.println("2^ "+n+" is "+ ans);
    }
    public static int power(int n){
        if(n==0){
            return 1;
        }else{
            return 2*power(n-1);
        }
    }
}
