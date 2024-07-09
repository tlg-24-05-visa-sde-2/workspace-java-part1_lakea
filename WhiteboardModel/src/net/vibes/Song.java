package net.vibes;

public class Song {

    private String name;
    private SongType genre;
    private String artist;

    // Default constructor
    public Song() {
    }

    public Song(String name) {
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

    // Other methods
    public void play(String iWantYouAround) {
        System.out.println("Playing: " + artist + " - " + name);
    }

    public void pause() {
        System.out.println("Pausing: " + artist + " - " + name);
    }

    public void changeSong() {
        System.out.println("Changing song in library");
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", artist='" + artist + '\'' +
                '}';
    }
}