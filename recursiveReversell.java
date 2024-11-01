import java.util.*;
public class recursiveReversell {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(99);
        ll.add(98);
        ll.add(97);
        ll.add(96);
        ll.add(95);
        System.out.println("Original linked list "+ll);
        reversell(ll);
        System.out.println("Reverse Linked list is "+ll);

    }
    public static void reversell(LinkedList<Integer>ll){
        if(ll.isEmpty()){
            return;
        }
        int first=ll.removeFirst();
        reversell(ll);
        ll.addLast(first);
    }
}
