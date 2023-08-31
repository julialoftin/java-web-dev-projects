package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem burger = new MenuItem("burger", 8.99, "an american classic", "entree", true);
        MenuItem fries = new MenuItem("fries", 2.19, "yummy potato", "side", false);
        MenuItem gyoza = new MenuItem("gyoza", 6.99, "yummy fried wontons", "appetizer", true);

        // Create Menu class
        Menu popUp = new Menu();

        // Adding items to menuItem
        popUp.addItem(burger);
        popUp.addItem(fries);
        popUp.addItem(gyoza);

        // Using toString() to print individual items
        System.out.println(burger);
        System.out.println(fries);

        // Using custom toString() to print entire menu
        System.out.println(popUp);

        // Using custom equals() method to compare the menuItems
        System.out.println(burger.equals(fries));

        popUp.removeItem(fries);
        System.out.println(popUp);

        System.out.println(fries.getNew());

        System.out.println(popUp.getLastUpdated());

    }
}
