class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;

    // constructors - these get called when the client says new]
    public Movie() {
        // no op
    }

    public Movie(String title) {
        setTitle(title);
    }
    public Movie(String title, int releaseYear, double revenue) {
        this(title);            // delegate to the ctor above me for title
        setReleaseYear(releaseYear);        // delegate to setters for the rest of them
        setRevenue(revenue);
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
    public String toString() {
        return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() +
                ", revenue=" + getRevenue();
    }
}