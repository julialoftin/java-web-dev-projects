package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = LocalDate.now();
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setItem(MenuItem item) {
        this.items.add(item);
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public static removeItem

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }


}


