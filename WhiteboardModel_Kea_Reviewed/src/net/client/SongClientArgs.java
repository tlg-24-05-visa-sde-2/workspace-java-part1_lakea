package net.client;

import net.vibes.Song;
import net.vibes.SongType;

/*
 * Client main-class that allows a user to specify values for the properties
 * in an instance of Song.
 */

/**
 * JR: usage banner flawed and lacking in detail.
 *  - Example usages do not work, resulting in unhandled exception and program crash.
 *  - Supported genres are not listed, user has no way to figure out how to run it.
 *
 * Appears to be a direct copy of instructor's example for Guitar, taken from GitHub repo.
 *  https://github.com/tlg-24-05-visa-sde-2/workspace-java-part1_jay-rostosky/blob/main/WhiteboardModel/src/com/music/client/GuitarClientArgs.java
 */
public class SongClientArgs {

    public static void main(String[] args) {
        if (args.length < 3) {
            printUsage();
            return;
        }

        // Extract command-line arguments
        String name = args[0];
        SongType genre = SongType.valueOf(args[1].toUpperCase()); // Convert genre string to enum
        String artist = args[2];

        // Create a new Song object
        Song song = new Song(name, genre, artist);

        // Print song details
        printSongDetails(song);
    }

    private static void printSongDetails(Song song) {
        String order =
                "You're now playing....\n" +
                        "Enjoy\n" + song;
        System.out.println(order);
    }

    private static void printUsage() {
        String usage =
                "Usage: java SongClientArgs <name> <genre> <artist>\n" +
                        "Examples:\n" +
                        "  java SongClientArgs UpBeatSong R&B Brent Faiyez\n" +
                        "  java SongClientArgs CalmingSong R&B Snoh Aalegra\n" +
                        "  java SongClientArgs SlowSong OldSchool Mary J Blidge";
        System.out.println(usage);
    }
}
