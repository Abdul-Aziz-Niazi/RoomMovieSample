package az3ez.com.roomsample.ui;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import az3ez.com.roomsample.R;
import az3ez.com.roomsample.adapter.MovieAdapter;
import az3ez.com.roomsample.database.AppDatabase;
import az3ez.com.roomsample.model.Movie;
import az3ez.com.roomsample.util.DataGenerator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private List<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView movieRV = findViewById(R.id.mainRV);
        final AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "Movies").allowMainThreadQueries().build();
        new Runnable() {
            @Override
            public void run() {
                movieList = database.moviesDAO().getAll();
                Log.d(TAG, "run: DB "+movieList.size());
                if (movieList.size() == 0) {
                    movieList = DataGenerator.generate();
                    database.moviesDAO().insertAll(movieList);
                }
            }
        }.run();
        Log.d(TAG, "onCreate: "+movieList);
        MovieAdapter adapter = new MovieAdapter(this, movieList);
        movieRV.setLayoutManager(new LinearLayoutManager(this));
        movieRV.setAdapter(adapter);
    }
}
