import java.util.*;
public class deleteLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(21);
        ll.add(30);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.remove(20);
        System.out.println(ll);
    }
}
