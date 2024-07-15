package net.test;

import net.vibes.Song;

/**
 * JR: there is no data validation in the Song class, so nothing to test here.
 * The call to s.setName() changes the name, but the println is showing s.getArtist().
 */
class SongValidationTest {

    public static void main(String[] args) {
        Song s = new Song();

        s.setArtist("Brent Faiyez");
        System.out.println("artist: " + s.getArtist());

        s.setArtist("Snoh Aalegra");
        System.out.println("artist: " + s.getArtist());

        s.setName("Summer Walker");                     // error message Summer Walker is rejected
        System.out.println("artist: " + s.getArtist());         //should be Brent Faiyez or Snoh Aalegra
    }
}