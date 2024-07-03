class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating = Rating.PG;
    private Genre genre;

    // constructors - these get called when the client says new]
    public Movie() {
        // no op
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }
    public Movie(String title, int releaseYear, double revenue, Rating rating, Genre genre) {
        this(title);            // delegate to the 2-arg constructor above me for title, genre
        setReleaseYear(releaseYear);        // delegate to setters for the rest of them
        setRevenue(revenue);                // by delegating to their respective setters
        setRating(rating);
    }

    // business or action methods
    // play(), pause(), rewind(), fastForward(), stop(), goTo()

    //accessor methods - provide controlled access to the object's private fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() +
                ", revenue=" + getRevenue() + ", rating=" + getRating();
    }
}