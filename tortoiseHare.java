import java.util.*;
public class tortoiseHare {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        int slowindex=0;
        int fastindex=0;
        while (fastindex<ll.size()&& (fastindex+1)<ll.size()) {
            slowindex++;
            fastindex=fastindex+2;
        }
        System.out.println("Middle of the linkedlist is :"+ll.get(slowindex));
    }
}
