package com.example.baicuoiky.Service;

import com.example.baicuoiky.Model.Album;
import com.example.baicuoiky.Model.Baihat;
import com.example.baicuoiky.Model.ChuDe;

import com.example.baicuoiky.Model.PlayList;
import com.example.baicuoiky.Model.Quangcao;
import com.example.baicuoiky.Model.Theloai;
import com.example.baicuoiky.Model.Theloaitrongngay;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Dataservice {
    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("paylistforcurrentday.php")
    Call<List<PlayList>> GetPlayListCurrentDay();

    @GET("Chudevatheloai.php")
    Call<Theloaitrongngay> GetCategoryMusic();

    @GET("Albumhot.php")
    Call<List<Album>> GetAlbumhot();

    @GET("baihatduocthich.php")
    Call<List<Baihat>> GetBaiHatHot();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaihattheoquangcao(@Field("idquangcao") String idquangcao);


    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaitheoplaylist(@Field("idpaylist") String idpaylist);

    @GET("danhsachcacplaylist.php")
    Call<List<PlayList>> GetDanhsachcacPlaylist();


    @GET("tatcacchude.php")
    Call<List<ChuDe>> GetAllChude();

    @FormUrlEncoded
    @POST("theloaitheochude.php")
    Call<List<Theloai>> GetTheloaitheochude(@Field("idchude") String idchude);

    @GET("tatcaalbum.php")
    Call<List<Album>> GetAllAlbum();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaihattheoalbum(@Field("idalbum") String idalbum);

    @FormUrlEncoded
    @POST("updateluotthich.php")
    Call<String> UpdateLuotThich(@Field("luotthich") String luotthich, @Field("idbaihat") String idbaihat);

    @FormUrlEncoded
    @POST("searchbaihat.php")
   Call<List<Baihat>> GetSearchBaihat(@Field("tukhoa") String tukhoa);


}
