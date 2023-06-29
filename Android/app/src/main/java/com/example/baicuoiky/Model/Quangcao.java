package com.example.baicuoiky.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Quangcao implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("hinhanh")
    @Expose
    private String hinhanh;
    @SerializedName("noidung")
    @Expose
    private String noidung;
    @SerializedName("idbaihat")
    @Expose
    private String idbaihat;
    @SerializedName("tenBaiHat")
    @Expose
    private String tenBaiHat;
    @SerializedName("banner")
    @Expose
    private String banner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getIdbaihat() {
        return idbaihat;
    }

    public void setIdbaihat(String idbaihat) {
        this.idbaihat = idbaihat;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }


}