// 1b.6 Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to remove (0 to " + (colors.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            colors.remove(index);
            System.out.println("Updated Colors: " + colors);
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
