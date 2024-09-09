import java.util.*;
public class Printing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num ");
        int n=sc.nextInt();
        print(n);
    }
    public static void  print(int n){
        if(n==0){
            return ;
        }else{
            System.out.print(n+" ");
             print(n-1);
        }
    }
}
