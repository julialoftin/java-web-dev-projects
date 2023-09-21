package org.launchcode;

public abstract class BaseDisc {
    private String releaseDate;
    private String producer;
    private double dataInGb;
    private boolean isReadable;

    public BaseDisc(String releaseDate, String producer, double dataInGb, boolean isReadable) {
        this.releaseDate = releaseDate;
        this.producer = producer;
        this.dataInGb = dataInGb;
        this.isReadable = isReadable;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getDataInGb() {
        return dataInGb;
    }

    public void setDataInGb(double dataInGb) {
        this.dataInGb = dataInGb;
    }

    public boolean isReadable() {
        return isReadable;
    }

    public void setReadable(boolean readable) {
        isReadable = readable;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
