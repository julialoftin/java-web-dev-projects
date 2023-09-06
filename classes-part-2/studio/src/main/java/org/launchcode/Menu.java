package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

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

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }
    public void addMenuItem(MenuItem item) {
        this.items.add(item);

    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(items, menu.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}


