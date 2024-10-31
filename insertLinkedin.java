import java.util.*;
public class insertLinkedin {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println(ll);
        ll.add(2, 15);
        ll.addLast(1);
        System.out.println(ll);
    }
}
