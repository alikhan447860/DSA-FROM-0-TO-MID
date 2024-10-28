import java.util.*;
public class reachhome{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the destination");
    int dest=sc.nextInt();
    System.out.println("ENter your starting point");
    int start=sc.nextInt();
home(start, dest);
 }
 public static void  home(int start,int dest){
    if(start==dest){
        System.out.println("Me ghar aagya");
        return ;
    }
    System.out.println("current positoin "+start);
    home(start+1, dest);

 }
}