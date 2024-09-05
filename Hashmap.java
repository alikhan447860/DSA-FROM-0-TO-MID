import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 140);
        map.put("China", 140);
        map.put("Pakistan", 35);
    System.out.println(map);
    // updating
    map.put("China", 180);
    System.out.println(map);
    // searching
    if(map.containsKey("indonesia")){
        System.out.println("Contains indonesia");
    }
    else{
     System.out.println("donot contain indonesia");
    }
    //check
    System.out.println(map.get("China"));
    System.out.println(map.get("indonesia"));
    //itration on map hashset
    for(Map.Entry<String,Integer>e:map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    }

    
}
