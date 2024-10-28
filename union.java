import java.util.*;
public class union {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={5,6,2,1,4,3,7};
      HashSet<Integer>unionset=new HashSet<>();
      for(int num:arr1){
        unionset.add(num);
      }
      for(int num:arr2){
        unionset.add(num);
      }
      System.out.println("The union of both the array is ");
      for(int val:unionset){
        System.out.print(val+" ");
      }
    }
}
