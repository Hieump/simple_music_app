 package com.example.baicuoiky.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baicuoiky.Activity.PlayNhacActivity;
import com.example.baicuoiky.Model.Baihat;
import com.example.baicuoiky.R;
import com.example.baicuoiky.Service.APIService;
import com.example.baicuoiky.Service.Dataservice;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchbaihatAdapter  extends  RecyclerView.Adapter<SearchbaihatAdapter.ViewHolder>{
    Context context;
    ArrayList<Baihat> mangbaihat;

    public SearchbaihatAdapter(Context context, ArrayList<Baihat> mangbaihat) {
        this.context = context;
        this.mangbaihat = mangbaihat;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.dong_search_baihai,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Baihat baihat = mangbaihat.get(position);
        holder.txtTenbaihat.setText(baihat.getTenbaihat());
        holder.txtcasi.setText(baihat.getCasi());
        Picasso.get().load(baihat.getHinhbaihat()).into(holder.imgbaihat);
    }

    @Override
    public int getItemCount() {
        return mangbaihat.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
       TextView txtTenbaihat, txtcasi;
      ImageView imgbaihat, imgluotthich;

      public ViewHolder(@NonNull View itemView) {
          super(itemView);
        txtTenbaihat = itemView.findViewById(R.id.textViewsearchtenbaihat);
         txtcasi = itemView.findViewById(R.id.textViewsearchtencasi);
          imgbaihat = itemView.findViewById(R.id.imageViewsearchbaihat);
          imgluotthich = itemView.findViewById(R.id.imageViewsearchluotlike);
          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(context, PlayNhacActivity.class);
                  intent.putExtra("cakhuc",mangbaihat.get(getPosition()));
                  context.startActivity(intent);
              }
          });
          imgluotthich.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  imgluotthich.setImageResource(R.drawable.icon_lovelike);
                  Dataservice dataservice = APIService.getService();
                  Call<String> callback = dataservice.UpdateLuotThich("1", mangbaihat.get(getPosition()).getIdbaihat());
                  callback.enqueue(new Callback<String>() {
                      @Override
                      public void onResponse(Call<String> call, Response<String> response) {
                          String ketqua = response.body();
                          if (ketqua.equals("Success")){
                              Toast.makeText(context, "dathich", Toast.LENGTH_SHORT).show();

                          }else {
                              Toast.makeText(context, "fail",Toast.LENGTH_SHORT).show();
                          }
                      }

                      @Override
                      public void onFailure(Call<String> call, Throwable t) {

                      }
                  });
                  imgluotthich.setEnabled(false);
              }
          });
      }
    }
}
