package az3ez.com.roomsample.util;

import java.util.ArrayList;
import java.util.List;

import az3ez.com.roomsample.R;
import az3ez.com.roomsample.model.Movie;

/**
 * Created by AbdulAziz on 6/10/2018.
 */

public class DataGenerator {
    public static List<Movie> generate() {
        List<Movie> movieList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Movie movie = new Movie(i, "Some Movie " + i, genre[i % 2], images[i%4] );
            movieList.add(movie);
        }
        return movieList;
    }

    private static String genre[] = {
            "Action",
            "Comedy",
            "Sci Fi"
    };

    private static int[] images = {
            R.drawable.post_1,
            R.drawable.post_2,
            R.drawable.post_3,
            R.drawable.post_4
    };
}
