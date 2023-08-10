package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        System.out.println("The radius of the circle is: " + Circle.getArea(radius));
    }

}
