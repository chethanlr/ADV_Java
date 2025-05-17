// 1c.5 Write a Java program that swaps two elements (first and third elements) in a linked list using Collections.swap()

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before swap: " + colors);
        Collections.swap(colors, 0, 2); // swap first and third
        System.out.println("After swap: " + colors);
    }
}
