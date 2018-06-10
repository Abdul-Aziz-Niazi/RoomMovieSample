package az3ez.com.roomsample.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import az3ez.com.roomsample.model.Movie;

/**
 * Created by AbdulAziz on 6/10/2018.
 */

@Database(entities = {Movie.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MoviesDAO moviesDAO();
}
