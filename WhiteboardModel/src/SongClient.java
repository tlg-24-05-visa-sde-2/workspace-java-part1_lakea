public class SongClient {

    public static void main(String[] args) {
        // Create a Song object and set its properties via individual setter calls
        Song s1 = new Song();
        s1.setGenre("R&B");
        s1.setArtist("Brent Faiyaz");
        s1.setName("WY@");

        // Perform actions on the song
        s1.play();
        s1.pause();
        s1.shuffle();
        // Assuming stop() method is part of Song class, otherwise remove this line

        // Print song details
        System.out.println(s1);
    }
}