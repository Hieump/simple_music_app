package com.example.baicuoiky.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baicuoiky.Activity.DanhsachbaihatActivity;
import com.example.baicuoiky.Model.Album;
import com.example.baicuoiky.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {
    Context context;
    ArrayList<Album> mangalbum;

    public AlbumAdapter(Context context, ArrayList<Album> mangalbum) {
        this.context = context;
        this.mangalbum = mangalbum;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_album,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Album album = mangalbum.get(position);
        holder.txtcasialbum.setText(album.getTenCaSiAlbum());
        holder.txttenalbum.setText(album.getTenAlbum());
        Picasso.get().load(album.getHinhAlBum()).into(holder.imghinhanhalbum);

    }

    @Override
    public int getItemCount() {
        return mangalbum.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imghinhanhalbum;
        TextView txttenalbum,txtcasialbum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imghinhanhalbum = itemView.findViewById(R.id.imageViewalbum);
            txttenalbum = itemView.findViewById(R.id.textViewtenalbum);
            txtcasialbum = itemView.findViewById(R.id.textViewtencasialbum);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DanhsachbaihatActivity.class);
                    intent.putExtra("album",mangalbum.get(getPosition()));
                    context.startActivity(intent);
                }
            });

        }
    }
}
