// 1c.3 Write a Java program to insert the specified element at the end of a linked list using offerLast("Pink")

import java.util.LinkedList;

public class LinkedListInsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.offerLast("Pink");
        System.out.println("After inserting at end: " + colors);
    }
}
