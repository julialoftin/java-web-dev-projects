package org.example;

public abstract class Computer extends AbstractEntity {
    private String cpu;
    private String screenType;
    private boolean canAccessInternet;

    // CONSTRUCTOR
    public Computer(String cpu, String screenType, boolean canAccessInternet) {
        this.cpu = cpu;
        this.screenType = screenType;
        this.canAccessInternet = canAccessInternet;
    }

    // GETTERS AND SETTERS
    public void setCpu() {
        this.cpu = cpu;
    }
    public void setScreenType() {
        this.screenType = screenType;
    }
    public String getCpu() {
        return cpu;
    }
    public String getScreenType() {
        return screenType;
    }

    // METHODS

    public String accessInternet() {
        return (canAccessInternet == true) ? "You are now connected to the internet!" : "Your device can't connect to the internet!";
    }

    public String watchYouTube() {
        return (screenType.equalsIgnoreCase("oled")) ? "YouTube so pretty!" : "720p YouTube, ew";
    }

}
