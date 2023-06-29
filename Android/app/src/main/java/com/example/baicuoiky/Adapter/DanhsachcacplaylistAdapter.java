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
import com.example.baicuoiky.Model.PlayList;
import com.example.baicuoiky.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DanhsachcacplaylistAdapter extends RecyclerView.Adapter<DanhsachcacplaylistAdapter.ViewHolder> {
    Context context;
    ArrayList<PlayList> mangplayLists;

    public DanhsachcacplaylistAdapter(Context context, ArrayList<PlayList> mangplayLists) {
        this.context = context;
        this.mangplayLists = mangplayLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_danhsachcac_playlist,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlayList playList = mangplayLists.get(position);
        Picasso.get().load(playList.getHinhNen()).into(holder.imghinhnen);
        holder.txttenplaylist.setText(playList.getTen());

    }

    @Override
    public int getItemCount() {
        return mangplayLists.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView imghinhnen;
        TextView txttenplaylist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imghinhnen = itemView.findViewById(R.id.imageViewdanhsachcacplaylist);
            txttenplaylist = itemView.findViewById(R.id.textViewtendanhsachcacplaylist);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DanhsachbaihatActivity.class);
                    intent.putExtra("itempaylist",mangplayLists.get(getPosition()));
                    context.startActivity(intent);
                }
            });

        }
    }
}
