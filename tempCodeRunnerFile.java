import java.util.*;
public class finddup {
    public static void main(String[] args) {
       int arr[]={12,23,21,23,45};
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]==arr[j+1]){
                System.out.println("Element has duplicate value in array "+arr[j]);
            }
        }
       }
    }
}
