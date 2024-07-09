package net.test;

import net.vibes.Song;

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