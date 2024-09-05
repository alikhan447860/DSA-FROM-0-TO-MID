import java.util.*;
public class Hashing {
    public static void main(String[] args){
        HashSet hs=new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        // print all element
        System.out.println(hs);
        // search 1
        if(hs.contains(1)){
            System.out.println("it contains element 1");
        }
         // remove 1
        hs.remove(1);
        if(!hs.contains(1)){
            System.out.println("we remove 1 ");
        }else{
            System.out.println("not removed yet");
        }
        //iterator
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
   
    
}
