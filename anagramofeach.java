import java.util.*;
public class anagramofeach {
    public static void main(String []args){
        String str1="silent";
        String str2="listen";
        if(str1.length()!=str2.length()){
         return ;
        }
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("The string is anagram of each other");
        }else{
            System.out.println("THe strings is not anagram of each other");
        }
    }
}
