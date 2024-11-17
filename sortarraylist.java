import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList with some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Date");
        list.add("Cherry");

        System.out.println("Original List: " + list);

        // Sorting the ArrayList
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
