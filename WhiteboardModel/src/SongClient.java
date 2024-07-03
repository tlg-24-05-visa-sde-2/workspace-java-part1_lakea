class SongClient {

    public static void main(String[] args) {
        // create a Song object and set its properties via individual setter calls
       Song s1 = new Song();
        s1.setGenre = "R&B";
        s1.setArtist = "Brent Faiyez";
        s1.setName= "WY@";

        s1.play("WY@");
        s1.pause();
        s1.shuffle();
        s1.stop();
        System.out.println();


    }
}