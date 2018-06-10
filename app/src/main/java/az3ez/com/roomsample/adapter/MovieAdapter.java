package az3ez.com.roomsample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import az3ez.com.roomsample.R;
import az3ez.com.roomsample.model.Movie;

/**
 * Created by AbdulAziz on 6/10/2018.
 */

public class MovieAdapter extends RecyclerViewBaseAdapter<Movie, MovieAdapter.ViewHolder> {

    private static final String TAG = MovieAdapter.class.getSimpleName();
    private final Context context;
    private final List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movieList) {
        super(movieList, null);
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(context).inflate(R.layout.li_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        holder.setItem(getItem(position), position);
    }



    class ViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
        }

        void setItem(Movie movie, int position) {
            Log.d(TAG, "setItem: " + movie.getTitle());
            imageView = itemView.findViewById(R.id.poster);
            textView = itemView.findViewById(R.id.title);
            imageView.setImageResource(movie.getPoster());
            textView.setText(movie.getTitle());
        }
    }
}
