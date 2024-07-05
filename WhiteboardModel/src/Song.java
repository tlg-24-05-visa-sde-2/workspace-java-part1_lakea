public class Song {

    private String name;
    private String genre;
    private String artist;

    // Constructors, getters, setters, toString() method, and other methods

    public Song() {
        // Default constructor
    }

    public Song(String name, String genre, String artist) {
        this.name = name;
        this.genre = genre;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing: " + artist + " - " + name);
    }

    public void pause() {
        System.out.println("Pausing: " + artist + " - " + name);
    }

    public void shuffle() {
        System.out.println("Shuffling all songs in library");
    }

    // Assuming stop() method does not exist, so it's removed
    // If needed, implement and add it to the class

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}