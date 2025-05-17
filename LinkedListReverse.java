// 1c.2 Write a Java program to iterate a linked list in reverse order using descendingIterator()

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Iterator<String> descending = colors.descendingIterator();
        System.out.println("LinkedList in reverse order:");
        while (descending.hasNext()) {
            System.out.println(descending.next());
        }
    }
}
