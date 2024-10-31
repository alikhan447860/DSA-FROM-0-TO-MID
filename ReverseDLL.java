import java.util.*;
public class ReverseDLL {
    public static void main(String[] args) {
        LinkedList<Integer>dll=new LinkedList<>();
        dll.add(10);
        dll.add(30);
        dll.add(55);
        dll.add(88);
        System.out.println(dll);
        LinkedList<Integer>reversedll=new LinkedList<>();
        for(int i=dll.size()-1;i>=0;i--){
        reversedll.add(dll.get(i));
    }
    System.out.println(reversedll);

}
}
