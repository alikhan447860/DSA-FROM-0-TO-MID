import java.util.*;
public class checkLLispalindrome {
    public static void main(String[] args) {
  LinkedList<Integer>ll=new LinkedList<>();
  ll.add(1);
  ll.add(2);
  ll.add(3);
  ll.add(2);
  ll.add(1);
  ArrayList<Integer>al=new ArrayList<>(ll);
  int right=al.size()-1;
  int left=0;
  boolean ispalindrome=true;
  if(al.get(left)!=al.get(right)){
     ispalindrome=false;
  }
  if(ispalindrome){
    System.out.println("The linkedlist is palindrome");
  }else{
    System.out.println("The linkedlist is not a palindrome");
  }
    }
}
