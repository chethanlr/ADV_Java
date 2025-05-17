// 1b.2 Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original Colors: " + colors);
        if (colors.size() > 1) {
            colors.remove(1); // Remove 2nd element (index 1)
        }
        colors.remove("Blue");

        System.out.println("Colors after removals: " + colors);
    }
}
