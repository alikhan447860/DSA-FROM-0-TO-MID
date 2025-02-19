import java.util.*;
public class Frequencyofchar{
    public static void main(String[] args) {
        String str="Hello You";
        HashMap<Character,Integer>freqmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freqmap.containsKey(ch)){
                freqmap.put(ch, freqmap.get(ch)+1);
            }else{
                freqmap.put(ch, 1);
            }
        }
        for(char ch:freqmap.keySet()){
            System.out.println(ch+" : "+freqmap.get(ch));
        }
    }
}