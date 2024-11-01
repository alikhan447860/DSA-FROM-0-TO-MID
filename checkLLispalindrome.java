import java.util.*;
public class checkLLispalindrome {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ArrayList<Integer>al=new ArrayList<>(ll);
        int left=0;
        int right=al.size()-1;
        boolean ispalindrome=true;
        if(!al.get(left).equals(al.get(right))){
            ispalindrome=false;
        }
        System.out.println("The linkedlist is palindrome ? : "+ispalindrome);

    }
}
