import java.util.*;
public class finddup {
    public static void main(String[] args) {
       int arr[]={12,23,21,23,45,32,45};
       boolean hasdup=false;
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                hasdup=true;
                System.out.println(" duplicate value found "+arr[j]);
            }
        }
       }
       if(!hasdup){
        System.out.println("Array has no duplicate element in it");
       }
    }
}