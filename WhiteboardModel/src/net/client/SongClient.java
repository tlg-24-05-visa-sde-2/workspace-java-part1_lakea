package net.client;

import net.vibes.Song;
import net.vibes.SongType;

public class SongClient {

public static void main(String[] args) {
    // create a Song object and set its properties via individual setter calls
    Song s1 = new Song();
    s1.setName("WY@");
    s1.setArtist("Brent Faiyez");
    s1.setGenre(SongType.R_AND_B);

    // then call methods on it
    s1.changeSong();
    s1.play("WY@");
    s1.pause();

    System.out.println();  // blank line, for better readability in the output

    // create another instance via the 3-arg constructor
    Song s2 = new Song("I Want You Around", SongType.R_AND_B, "Snoh Aalegra");

    s2.changeSong();
    s2.play("I Want You Around");
    s2.pause();

    System.out.println();

    // show their toString() methods in action
    System.out.println(s1.toString());
    System.out.println(s2);  // toString() automatically called
}
}