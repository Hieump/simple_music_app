package com.example.baicuoiky.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baicuoiky.Model.PlayList;
import com.example.baicuoiky.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<PlayList> {
    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<PlayList> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        TextView txttenplaylist;
        ImageView imgbackground,imgplaylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
            if (convertView == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.dong_playlist, null);
                viewHolder = new ViewHolder();
                viewHolder.txttenplaylist = convertView.findViewById(R.id.textviewTenPlaylist);
                viewHolder.imgplaylist = convertView.findViewById(R.id.imageViewplaylist);
                viewHolder.imgbackground = convertView.findViewById(R.id.imagebackgroundplaylist );
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            PlayList playList = getItem(position);
        Picasso.get().load(playList.getHinhNen()).into(viewHolder.imgbackground);
        Picasso.get().load(playList.getHinhIcon()).into(viewHolder.imgplaylist);
        viewHolder.txttenplaylist.setText(playList.getTen());
        return convertView;
    }
}


