package net.flix;

public enum Genre {
    ANIME("Anime"),
    DRAMA("Drama..."),
    HORROR("HORROR!!!"),
    ROMANTIC_COMEDY("Romantic Comedy :*"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery -o-"),
    SCI_FI ("Sci-Fi"),
    COMEDY("Comedy^-^");

    // everything under here is just regular class definition stuff i.e., fields, class methods
    private String display;

    // implicitly private, no "new" from outside
    Genre(String display) {
        System.out.println("Genre constructor called");
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}
