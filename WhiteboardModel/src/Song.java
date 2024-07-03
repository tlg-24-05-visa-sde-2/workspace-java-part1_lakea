class Song {
// properties or attributes (limit to 5 or 6)
   private String name;
   private String setGenre; //constraint: (Hip Hop, R&B. Old School)
   private String setArtist;

   // constraints
    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetGenre() {
        return setGenre;
    }

    public void setSetGenre(String setGenre) {
        this.setGenre = setGenre;
    }

    public String getSetArtist() {
        return setArtist;
    }

    public void setSetArtist(String setArtist) {
        this.setArtist = setArtist;
    }

//    public Song(String name) {
//        setName(name);
//    }
//
//    public Song(String name, String genre) {
//        this(name);
//        setGenre(genre);
//    }
//
//    public Song(String name, String genre, String artist) {
//        this(name, genre);
//        setArtist(artist);
//    }
}

//functions or behaviors - what do Song objects do?

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getSetGenre() {
    return setGenre;
}

public void setSetGenre(String setGenre) {
    this.setGenre = setGenre;
}

public String getSetArtist() {
    return setArtist;
}

public void setSetArtist(String setArtist) {
    this.setArtist = setArtist;
}

public Song(String name) {
    setName(name);
}




 public void play(String setSong) {
    System.out.println("Now playing... " + "artist" + " song");

    public void pause() {
        System.out.println("Pausing..." + "artist" + " song";
    }

    public void changeSong() {
         System.out.println("Changing song " + "artist" + " song");
     }

    public void shuffle() {
        System.out.println("Shuffling all songs in library");
    }

    // accessor methods - provide controlled access to the object's field
}
@Override
public String toString() {
    return "Song{" +
            "setArtist='" + setArtist + '\'' +
            ", setGenre='" + setGenre + '\'' +
            ", name='" + name + '\'' +
            '}';
}