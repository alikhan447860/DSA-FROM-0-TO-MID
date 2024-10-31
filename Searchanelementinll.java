import java.util.*;
public class Searchanelementinll {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(44);
        ll.add(43);
        ll.add(42);
        int target=42;
        boolean isfound=ll.contains(target);
        if(isfound){
        System.out.println("element is found");
    }else{
        System.out.println("Element is not found");
    }
}
}
