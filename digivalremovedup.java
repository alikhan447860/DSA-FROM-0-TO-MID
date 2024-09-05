import java.util.*;
public class digivalremovedup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of element of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elemt is "+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicate is foundnilne ho");
    }
}
