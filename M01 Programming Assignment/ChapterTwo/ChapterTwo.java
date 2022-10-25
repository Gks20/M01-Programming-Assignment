//Convert Feet into Meters

import java.util.Scanner;

public class ChapterTwo {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Constant Value
        final double METERS_PER_FOOT = 0.305;

        // Ask for input # of feet
        System.out.print("Enter length in feet : ");
        double feet = input.nextDouble();

        // Convert to meters

        double meters = feet * METERS_PER_FOOT;

        // output resuts
        System.out.println(feet + "Feet is" + meters + "meters");

    }

}