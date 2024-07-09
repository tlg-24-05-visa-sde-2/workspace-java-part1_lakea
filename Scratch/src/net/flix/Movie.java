package net.flix;

import edu.tests.Rating;

class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
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
    public Movie(String title, Integer releaseYear, double revenue, Rating rating, Genre genre) {
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

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
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
        //TODO: make it right so that a null revenue shows up as null,
        // and a non-null shows up as 123,000,345.94.

        //HINT: if revenue is null use %s, if   use %f

        return String.format("Movie: title=%s, releaseYear=%s, revenue=$%,.2f, rating=%s, genre=%s",
        getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre().getDisplay());
    }
//        return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() +
//                ", revenue=" + getRevenue() + ", rating=" + getRating();
    }
