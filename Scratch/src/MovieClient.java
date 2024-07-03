class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Dune");
        movie1.setReleaseYear(2021);
        movie1.setRevenue(407_000_000.0);
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.SCI_FI);
        System.out.println(movie1);     //toString() automatically called
        System.out.println();


        Movie movie3 = new Movie("Finding Nemo", 2003, 940_000_000.0, Rating.G, Genre.MYSTERY); {
            System.out.println(movie3);     //toString() automatically called
            System.out.println();

            Movie movie4 = new Movie("Adventures of Jay and DeShon", Genre.MYSTERY);
            System.out.println(movie4);
            System.out.println();
        }
    }

}