package org.example;

public class Main {
    public static void main(String[] args) {
        Computer mac = new Laptop("bad", "OLED", true);
        System.out.println(mac.accessInternet());
        System.out.println(mac.getId());
    }
}