// 1c.4 Write a Java program to display elements and their positions in a linked list using get(index)

import java.util.LinkedList;

public class LinkedListElementPositions {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Elements with positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Index " + i + ": " + colors.get(i));
        }
    }
}
