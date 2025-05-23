// 1b.5 Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object using SubList()

import java.util.ArrayList;
import java.util.List;

public class SublistColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original Colors: " + colors);
        List<String> subColors = colors.subList(0, 2); // 1st and 2nd (index 0 and 1)
        System.out.println("Sublist (1st and 2nd colors): " + subColors);
    }
}
