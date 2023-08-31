package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();
    private MenuItem item;


    public Menu() {
        lastUpdated = LocalDate.now();
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return this.lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public MenuItem getItem() {
        return item;
    }
    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }
}
