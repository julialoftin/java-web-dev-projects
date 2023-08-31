package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
    // Getters
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getCategory() {
        return this.category;
    }
    public boolean getNew() {
        return this.isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass()) return false;
        MenuItem menuItem = (MenuItem) toBeCompared;
        return Double.compare(price, menuItem.price) == 0 && Objects.equals(name, menuItem.name) && Objects.equals(category, menuItem.category);
    }

}


