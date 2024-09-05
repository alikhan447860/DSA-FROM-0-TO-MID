import java.util.*;
public class Intersection {
    public static void main(String[] args){
        int arr1[]={1,2,3,4};
        int arr2[]={3,4};
        HashSet set1= new HashSet<>();
        HashSet inter=new HashSet<>();
        for(int num:arr1){
            set1.add(num);
        }
        for(int num:arr2){
            if(set1.contains(num)){
                inter.add(num);
            }
        }
        System.out.println(inter);

    }
}
