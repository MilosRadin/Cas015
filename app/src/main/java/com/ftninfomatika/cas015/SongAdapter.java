package com.ftninfomatika.cas015;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends BaseAdapter {

    public SongAdapter(List<Song> songs, Activity activity) {
        this.songs = songs;
        this.activity = activity;
    }

    private List<Song> songs;
    private Activity activity;


    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Song getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
        view = activity.getLayoutInflater().inflate(R.layout.song_single_item, null);
        }
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvAuthor = view.findViewById(R.id.tvAuthor);

        tvName.setText(songs.get(i).getName());
        tvAuthor.setText(songs.get(i).getAuthor());

        return view;
    }
}
