package com.example.flixter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {
    private String posterPath;
    private String title;
    private String overview;
    private double rating;
    private int id;

    public Movie() {}

    public Movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");
        id = jsonObject.getInt("id");
    }

    public String getPosterPath() { return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath); }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public double getRating() { return rating; }

    public int getID() {
        return id;
    }

    public static List<Movie> fromJSONArray(JSONArray movieArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < movieArray.length(); i++)
            movies.add(new Movie(movieArray.getJSONObject(i)));

        return movies;
    }

}
