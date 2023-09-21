package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    private String artist;
    private String albumTitle;

    public CD(String releaseDate, String producer, double dataInGb, boolean isReadable, String artist, String albumTitle) {
        super(releaseDate, producer, dataInGb, isReadable);
        this.artist = artist;
        this.albumTitle = albumTitle;
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
        System.out.println("Audio is playing");
    }

    @Override
    public String reportInformation() {
        if (isReadable()) {
            return "Released: " + getReleaseDate() + System.lineSeparator() +
                    "Title: " + albumTitle + System.lineSeparator() +
                    "Producer: " + getProducer() + System.lineSeparator() +
                    "Artist: " + artist + System.lineSeparator() +
                    "Data Stored: " + getDataInGb();
        } else {
            return "Disc is damaged!";
        }
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
