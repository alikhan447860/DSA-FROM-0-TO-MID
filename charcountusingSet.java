import java.util.*;
public class charcountusingSet {
    public static void main(String[] args) {
        String str="AAlikhan";
        HashSet<Character>hs=new HashSet<>();
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(!hs.contains(ch)){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            hs.add(ch);
            System.out.println(ch+ ":"+count);
        }
       }
    }
}
