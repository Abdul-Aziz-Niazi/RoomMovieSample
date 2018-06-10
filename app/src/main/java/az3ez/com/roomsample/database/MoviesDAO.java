package az3ez.com.roomsample.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import az3ez.com.roomsample.model.Movie;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by AbdulAziz on 5/31/2018.
 */
@Dao
public interface MoviesDAO {

    @Query("SELECT * From Movie")
    public List<Movie> getAll();

    @Insert(onConflict = REPLACE)
    public void insertAll(List<Movie> movies);
}
