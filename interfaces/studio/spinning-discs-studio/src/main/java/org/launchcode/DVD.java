package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    private String title;

    public DVD(String releaseDate, String producer, double dataInGb, boolean isReadable, String title) {
        super(releaseDate, producer, dataInGb, isReadable);
        this.title = title;
    }

    @Override
    public void spin() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void write() {

    }

    @Override
    public void read() {
        System.out.println("Video and audio is playing!");
    }

    @Override
    public String reportInformation() {
        if (isReadable()) {
            return "Released: " + getReleaseDate() + System.lineSeparator() +
                    "Title: " + title + System.lineSeparator() +
                    "Producer: " + getProducer() + System.lineSeparator() +
                    "Data Stored: " + getDataInGb();
        } else {
            return "Disc is damaged!";
        }
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
