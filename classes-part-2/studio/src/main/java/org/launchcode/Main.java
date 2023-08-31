package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem burger = new MenuItem(9.99, "a classic american burger", "entree", true);
        MenuItem fries = new MenuItem(3.99, "fried potato", "side", true);
        MenuItem pie = new MenuItem(5.99, "pumpkin pie", "dessert", false);
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(burger);
        items.add(fries);
        items.add(pie);
        Menu popUp = new Menu();
        popUp.setItems(items);

        System.out.println(popUp);
    }
}
