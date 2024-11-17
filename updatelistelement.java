import java.util.*;
public class updatelistelement {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("apple");
        al.add("cake");
        al.add("banana");
        al.add("cow");
        System.out.println("original list "+al);
        int indextoup=1;
        String elementtoup="cherry";
        if(indextoup>=0&& indextoup<al.size()){
            al.set(indextoup,elementtoup);
            System.out.println("updated lis :"+al);
        }else{
            System.out.println("invalid list");
        }
    }
}
