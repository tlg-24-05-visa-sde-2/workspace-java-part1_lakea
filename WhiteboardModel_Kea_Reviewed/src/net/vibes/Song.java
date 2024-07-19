package net.vibes;

/**
 * JR: Does not convincingly demonstrate understanding of program concepts, is incomplete,
 * and flawed in several areas.
 * <p>
 * Business methods are trivial and use direct field access instead of
 * leveraging data encapsulation and calling the getter methods.
 * <p>
 * No data validation whatsoever.
 * <p>
 * See comments below and in the other classes.
 * <p>
 * Code is clean, readable, well-formatted: needs improvement.
 * <p>
 * Class participation has been adequate, but could still be improved.
 * <p>
 * Class names, package names, and overall structure are not correct.
 * There is no base package, e.g., net.music,
 * which would yield the following package names for the assignment:
 * net.music
 * net.music.client
 * net.music.test
 * <p>
 * Instead, we have this;
 * net.client
 * net.test
 * net.vibes
 * <p>
 * 'net' is not a suitable base package name, and these packages do not adhere
 * to what was required.
 */
public class Song {

    private String name;
    private SongType genre;
    private String artist;

    // Default constructor
    public Song() {
    }

    public Song(String name) {
        // JR: call the setter instead, for any validation/conversion it might be doing
        this.name = name;
    }

    // Constructor with genre and artist parameters
    public Song(SongType genre, String artist) {
        this.genre = genre;
        this.artist = artist;
    }

    // Constructor with name, genre, and artist parameters
    public Song(String name, SongType genre, String artist) {
        this(name); // Calls the constructor that sets the name
        // JR: call the setters instead, we've done this repeatedly in class
        this.genre = genre;
        this.artist = artist;
    }

    // Getters and setters for name, genre, and artist
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SongType getGenre() {
        return genre;
    }

    public void setGenre(SongType genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // JR: call your own getters instead of direct field access in the methods below.

    // Other methods
    // JR: 'iWantYouAround' parameter goes unused, so delete it
    public void play(String iWantYouAround) {
        System.out.println("Playing: " + artist + " - " + name);
    }

    public void pause() {
        System.out.println("Pausing: " + artist + " - " + name);
    }

    public void changeSong() {
        System.out.println("Changing song in library");
    }

    /*
     * JR: I don't object to using the generated one,
     * but change it to call the getters instead of using direct field access.
     */
    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", artist='" + artist + '\'' +
                '}';
    }
}