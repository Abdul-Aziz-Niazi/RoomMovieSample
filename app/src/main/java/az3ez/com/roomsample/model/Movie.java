package az3ez.com.roomsample.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.DrawableRes;

/**
 * Created by AbdulAziz on 6/10/2018.
 */
@Entity
public class Movie {
    @PrimaryKey
    private int id;
    private String title;
    private String genre;
    private int poster;

    public Movie(int id, String title, String genre, @DrawableRes int poster) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.poster = poster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
