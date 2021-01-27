package com.example.flixter;

public class Movie {
    private String backdropPath;
    private String posterPath;
    private String title;
    private String overview;
    double rating;
    int movieId;

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public double getRating() {
        return rating;
    }

    public int getMovieId() {
        return movieId;
    }
}
